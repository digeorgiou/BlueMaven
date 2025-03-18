package gr.aueb.cf.blueapp.dao;

import gr.aueb.cf.blueapp.dao.exceptions.MaterialDAOException;
import gr.aueb.cf.blueapp.model.Material;

import java.util.List;

public interface IMaterialDAO {

    public Material insert(Material material) throws MaterialDAOException;
    public Material update(Material material) throws MaterialDAOException;
    public void delete(Integer id) throws MaterialDAOException;
    public Material getById(Integer id) throws MaterialDAOException;
    public List<Material> getAll() throws MaterialDAOException;
    public List<Material> getMaterialsByName(String name) throws MaterialDAOException;
    public List<Material> getMaterialsByQuantityLessThan(Integer quantity) throws MaterialDAOException;
}
