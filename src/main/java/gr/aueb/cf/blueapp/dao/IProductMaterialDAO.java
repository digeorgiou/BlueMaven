package gr.aueb.cf.blueapp.dao;

import gr.aueb.cf.blueapp.dao.exceptions.ProductMaterialDAOException;
import gr.aueb.cf.blueapp.model.ProductMaterial;

import java.util.List;

public interface IProductMaterialDAO {

    public ProductMaterial insert(ProductMaterial productMaterial) throws ProductMaterialDAOException;
    public ProductMaterial update(ProductMaterial productMaterial) throws ProductMaterialDAOException;
    public void delete(Integer productId, Integer materialId) throws ProductMaterialDAOException;
    public List<ProductMaterial> getByProductId(Integer productId) throws ProductMaterialDAOException;
    public List<ProductMaterial> getByMaterialId(Integer materialId) throws ProductMaterialDAOException;
    public ProductMaterial getByProductIdAndMaterialId(Integer productId,
                                                       Integer materialId);
}
