package gr.aueb.cf.blueapp.dao;

import gr.aueb.cf.blueapp.dao.exceptions.ProviderDAOException;
import gr.aueb.cf.blueapp.model.Provider;

import java.util.List;

public interface IProviderDAO {

    //Basic Services
    public Provider insert(Provider provider) throws ProviderDAOException;
    public Provider update(Provider provider) throws ProviderDAOException;
    public void delete(Integer id) throws ProviderDAOException;
    public Provider getById(Integer id) throws ProviderDAOException;
    public List<Provider> getAll() throws ProviderDAOException;


    public Provider getProviderByVat(String vat) throws ProviderDAOException;
    public Provider getProviderByPhoneNumber(String phoneNumber) throws ProviderDAOException;

}
