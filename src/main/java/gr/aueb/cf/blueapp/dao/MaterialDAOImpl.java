package gr.aueb.cf.blueapp.dao;

import gr.aueb.cf.blueapp.dao.exceptions.MaterialDAOException;
import gr.aueb.cf.blueapp.model.Material;
import gr.aueb.cf.blueapp.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MaterialDAOImpl implements IMaterialDAO {

    @Override
    public Material insert(Material material) throws MaterialDAOException {
        String sql = "INSERT INTO materials (name, quantity_in_stock, unit_price) VALUES (?, ?, ?)";

        Material insertedMaterial = null;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, material.getName());
            ps.setInt(2, material.getQuantityInStock());
            ps.setDouble(3, material.getUnitPrice());

            ps.executeUpdate();

            ResultSet rsGeneratedKeys = ps.getGeneratedKeys();
            if (rsGeneratedKeys.next()) {
                int generatedKey = rsGeneratedKeys.getInt(1);
                insertedMaterial = getById(generatedKey);
            }
            //logging
            return insertedMaterial;

        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new MaterialDAOException("SQL Error. Material with name: " + material.getName() + " was not inserted");
        }
    }

    @Override
    public Material update(Material material) throws MaterialDAOException {
        String sql = "UPDATE materials SET name = ?, quantity_in_stock = ?, unit_price = ? WHERE material_id = ?";

        Material updatedMaterial = null;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, material.getName());
            ps.setInt(2, material.getQuantityInStock());
            ps.setDouble(3, material.getUnitPrice());
            ps.setInt(4, material.getMaterialId());

            ps.executeUpdate();

            updatedMaterial = getById(material.getMaterialId());

            //logging
            return updatedMaterial;

        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new MaterialDAOException("SQL Error. Material with ID: " + material.getMaterialId() + " was not updated");
        }
    }

    @Override
    public void delete(Integer id) throws MaterialDAOException {
        String sql = "DELETE FROM materials WHERE material_id = ?";

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            //logging
        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new MaterialDAOException("SQL Error. Material with id: " + id + " not deleted.");
        }
    }

    @Override
    public Material getById(Integer id) throws MaterialDAOException {
        String sql = "SELECT * FROM materials WHERE material_id = ?";
        Material material = null;
        ResultSet rs;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                material = new Material(
                        rs.getInt("material_id"),
                        rs.getString("name"),
                        rs.getInt("quantity_in_stock"),
                        rs.getDouble("unit_price")
                );
            }
            return material;
        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new MaterialDAOException("SQL Error. Material with ID: " + id + " was not found");
        }
    }

    @Override
    public List<Material> getAll() throws MaterialDAOException {
        String sql = "SELECT * FROM materials";
        Material material = null;
        List<Material> materials = new ArrayList<>();
        ResultSet rs;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            rs = ps.executeQuery();

            while (rs.next()) {
                material = new Material(
                        rs.getInt("material_id"),
                        rs.getString("name"),
                        rs.getInt("quantity_in_stock"),
                        rs.getDouble("unit_price")
                );
                materials.add(material);
            }
            return materials;
        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new MaterialDAOException("SQL Error. Error in getAll materials");
        }
    }

    @Override
    public List<Material> getMaterialsByName(String name) throws MaterialDAOException {
        String sql = "SELECT * FROM materials WHERE name LIKE ?";
        Material material = null;
        List<Material> materials = new ArrayList<>();
        ResultSet rs;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, name + "%");
            rs = ps.executeQuery();

            while (rs.next()) {
                material = new Material(
                        rs.getInt("material_id"),
                        rs.getString("name"),
                        rs.getInt("quantity_in_stock"),
                        rs.getDouble("unit_price")
                );
                materials.add(material);
            }
            return materials;
        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new MaterialDAOException("SQL Error. Error in getMaterialsByName");
        }
    }

    @Override
    public List<Material> getMaterialsByQuantityLessThan(Integer quantity) throws MaterialDAOException {
        String sql = "SELECT * FROM materials WHERE quantity_in_stock < ?";
        Material material = null;
        List<Material> materials = new ArrayList<>();
        ResultSet rs;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, quantity);
            rs = ps.executeQuery();

            while (rs.next()) {
                material = new Material(
                        rs.getInt("material_id"),
                        rs.getString("name"),
                        rs.getInt("quantity_in_stock"),
                        rs.getDouble("unit_price")
                );
                materials.add(material);
            }
            return materials;
        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new MaterialDAOException("SQL Error. Error in getMaterialsByQuantityLessThan");
        }
    }
}
