package gr.aueb.cf.blueapp.dao;


import gr.aueb.cf.blueapp.dao.exceptions.ProductMaterialDAOException;
import gr.aueb.cf.blueapp.model.ProductMaterial;
import gr.aueb.cf.blueapp.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductMaterialDAOImpl implements IProductMaterialDAO {

    @Override
    //Inserts a new relationship between a product and a material into the product_materials table.
    public ProductMaterial insert(ProductMaterial productMaterial) throws ProductMaterialDAOException {
        String sql = "INSERT INTO product_materials (quantity_used, product_id, material_id) VALUES (?, ?, ?)";

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setDouble(1, productMaterial.getQuantityUsed());
            ps.setInt(2, productMaterial.getProductId());
            ps.setInt(3, productMaterial.getMaterialId());

            ps.executeUpdate();

            // If you need the generated keys (e.g., for an auto-incremented ID), you can retrieve them here.
            // For many-to-many relationships, this is often unnecessary unless you have a composite key.

            return productMaterial;

        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new ProductMaterialDAOException("SQL Error. Product-Material relationship was not inserted");
        }
    }

    @Override
    //Updates the quantity of a material used in a product.
    public ProductMaterial update(ProductMaterial productMaterial) throws ProductMaterialDAOException {
        String sql = "UPDATE product_materials SET quantity_used = ? WHERE product_id = ? AND material_id = ?";

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setDouble(1, productMaterial.getQuantityUsed());
            ps.setInt(2, productMaterial.getProductId());
            ps.setInt(3, productMaterial.getMaterialId());

            ps.executeUpdate();

            return productMaterial;

        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new ProductMaterialDAOException("SQL Error. Product-Material relationship was not updated");
        }
    }

    @Override
    //Delete: Deletes a relationship between a product and a material.
    public void delete(Integer productId, Integer materialId) throws ProductMaterialDAOException {
        String sql = "DELETE FROM product_materials WHERE product_id = ? AND material_id = ?";

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, productId);
            ps.setInt(2, materialId);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new ProductMaterialDAOException("SQL Error. Product-Material relationship was not deleted");
        }
    }

    @Override
    //GetByProductId: Retrieves all relationships for a specific product.
    public List<ProductMaterial> getByProductId(Integer productId) throws ProductMaterialDAOException {
        String sql = "SELECT * FROM product_materials WHERE product_id = ?";
        List<ProductMaterial> productMaterials = new ArrayList<>();
        ResultSet rs;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, productId);
            rs = ps.executeQuery();

            while (rs.next()) {
                ProductMaterial productMaterial = new ProductMaterial(
                        rs.getDouble("quantity_used"),
                        rs.getInt("product_id"),
                        rs.getInt("material_id")
                );
                productMaterials.add(productMaterial);
            }
            return productMaterials;

        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new ProductMaterialDAOException("SQL Error. Could not retrieve Product-Material relationships by product ID");
        }
    }

    @Override
    //GetByMaterialId: Retrieves all relationships for a specific material.
    public List<ProductMaterial> getByMaterialId(Integer materialId) throws ProductMaterialDAOException {
        String sql = "SELECT * FROM product_materials WHERE material_id = ?";
        List<ProductMaterial> productMaterials = new ArrayList<>();
        ResultSet rs;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, materialId);
            rs = ps.executeQuery();

            while (rs.next()) {
                ProductMaterial productMaterial = new ProductMaterial(
                        rs.getDouble("quantity_used"),
                        rs.getInt("product_id"),
                        rs.getInt("material_id")
                );
                productMaterials.add(productMaterial);
            }
            return productMaterials;

        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new ProductMaterialDAOException("SQL Error. Could not retrieve Product-Material relationships by material ID");
        }
    }

    @Override
    //Retrieves a specific relationship by both product ID and material ID.
    public ProductMaterial getByProductIdAndMaterialId(Integer productId, Integer materialId) throws ProductMaterialDAOException {
        String sql = "SELECT * FROM product_materials WHERE product_id = ? AND material_id = ?";
        ResultSet rs;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, productId);
            ps.setInt(2, materialId);
            rs = ps.executeQuery();

            if (rs.next()) {
                return new ProductMaterial(
                        rs.getDouble("quantity_used"),
                        rs.getInt("product_id"),
                        rs.getInt("material_id")
                );
            }
            return null;

        } catch (SQLException e) {
            e.printStackTrace();
            //logging
            throw new ProductMaterialDAOException("SQL Error. Could not retrieve Product-Material relationship by product ID and material ID");
        }
    }
}
