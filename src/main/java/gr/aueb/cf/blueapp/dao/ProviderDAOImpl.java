package gr.aueb.cf.blueapp.dao;

import gr.aueb.cf.blueapp.dao.exceptions.ProviderDAOException;
import gr.aueb.cf.blueapp.model.Provider;
import gr.aueb.cf.blueapp.util.DBUtil;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProviderDAOImpl implements IProviderDAO{

    @Override
    public Provider insert(Provider provider) throws ProviderDAOException {
        String sql = "INSERT INTO providers (provider_name, vat, doy, address, " +
                "phone_number, created_at, updated_at) VALUES (?, ?, ?, ?, ?, ?, ?)";

        Provider insertedProvider = null;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, provider.getProviderName());
            ps.setString(2, provider.getVAT());
            ps.setString(3, provider.getDOY());
            ps.setString(4, provider.getAddress());
            ps.setString(5, provider.getPhoneNumber());
            ps.setTimestamp(6, Timestamp.valueOf(LocalDateTime.now()));
            ps.setTimestamp(7, Timestamp.valueOf(LocalDateTime.now()));

            ps.executeUpdate();

            ResultSet rsGeneratedKeys = ps.getGeneratedKeys();
            if (rsGeneratedKeys.next()) {
                int generatedKey = rsGeneratedKeys.getInt(1);
                insertedProvider = getById(generatedKey);
            }
            //logging
            return insertedProvider;

        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new ProviderDAOException("SQL Error. Provider with name: "
                    + provider.getProviderName() + " was not inserted");
        }
    }

    @Override
    public Provider update(Provider provider) throws ProviderDAOException {
        String sql = "UPDATE providers SET provider_name = ?, vat = ?, doy = ?, address = ?, " +
                "phone_number = ?, updated_at = ? WHERE provider_id = ?";

        Provider updatedProvider = null;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, provider.getProviderName());
            ps.setString(2, provider.getVAT());
            ps.setString(3, provider.getDOY());
            ps.setString(4, provider.getAddress());
            ps.setString(5, provider.getPhoneNumber());
            ps.setTimestamp(6, Timestamp.valueOf(LocalDateTime.now()));
            ps.setInt(7, provider.getProviderId());

            ps.executeUpdate();

            updatedProvider = getById(provider.getProviderId());

            //logging
            return updatedProvider;

        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new ProviderDAOException("SQL Error. Provider with ID: " + provider.getProviderId() + " was not updated");
        }
    }

    @Override
    public void delete(Integer id) throws ProviderDAOException {
        String sql = "DELETE FROM providers WHERE provider_id = ?";

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            //logging
        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new ProviderDAOException("SQL Error. Provider with id: " + id + " not deleted.");
        }
    }

    @Override
    public Provider getById(Integer id) throws ProviderDAOException {
        String sql = "SELECT * FROM providers WHERE provider_id = ?";
        Provider provider = null;
        ResultSet rs;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                provider = new Provider(
                        rs.getInt("provider_id"),
                        rs.getString("provider_name"),
                        rs.getString("vat"),
                        rs.getString("doy"),
                        rs.getString("address"),
                        rs.getString("phone_number"),
                        rs.getTimestamp("created_at").toLocalDateTime(),
                        rs.getTimestamp("updated_at").toLocalDateTime()
                );
            }
            return provider;
        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new ProviderDAOException("SQL Error. Provider with ID: " + id + " was not found");
        }
    }

    @Override
    public List<Provider> getAll() throws ProviderDAOException {
        String sql = "SELECT * FROM providers";
        Provider provider = null;
        List<Provider> providers = new ArrayList<>();
        ResultSet rs;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            rs = ps.executeQuery();

            while (rs.next()) {
                provider = new Provider(
                        rs.getInt("provider_id"),
                        rs.getString("provider_name"),
                        rs.getString("vat"),
                        rs.getString("doy"),
                        rs.getString("address"),
                        rs.getString("phone_number"),
                        rs.getTimestamp("created_at").toLocalDateTime(),
                        rs.getTimestamp("updated_at").toLocalDateTime()
                );
                providers.add(provider);
            }
            return providers;
        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new ProviderDAOException("SQL Error. Error in getAll providers");
        }
    }

    @Override
    public Provider getProviderByVat(String vat) throws ProviderDAOException {
        String sql = "SELECT * FROM providers WHERE vat = ?";
        Provider provider = null;
        ResultSet rs;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, vat);
            rs = ps.executeQuery();

            if (rs.next()) {
                provider = new Provider(
                        rs.getInt("provider_id"),
                        rs.getString("provider_name"),
                        rs.getString("vat"),
                        rs.getString("doy"),
                        rs.getString("address"),
                        rs.getString("phone_number"),
                        rs.getTimestamp("created_at").toLocalDateTime(),
                        rs.getTimestamp("updated_at").toLocalDateTime()
                );
            }
            return provider;
        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new ProviderDAOException("SQL Error. Provider with VAT: " + vat + " was not found");
        }
    }

    @Override
    public Provider getProviderByPhoneNumber(String phoneNumber) throws ProviderDAOException {
        String sql = "SELECT * FROM providers WHERE phone_number = ?";
        Provider provider = null;
        ResultSet rs;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, phoneNumber);
            rs = ps.executeQuery();

            if (rs.next()) {
                provider = new Provider(
                        rs.getInt("provider_id"),
                        rs.getString("provider_name"),
                        rs.getString("vat"),
                        rs.getString("doy"),
                        rs.getString("address"),
                        rs.getString("phone_number"),
                        rs.getTimestamp("created_at").toLocalDateTime(),
                        rs.getTimestamp("updated_at").toLocalDateTime()
                );
            }
            return provider;
        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new ProviderDAOException("SQL Error. Provider with Phone Number: "
                    + phoneNumber + " was not found");
        }
    }

}
