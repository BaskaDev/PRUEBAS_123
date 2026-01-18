package co.bank.bbva.application.model.dao;

import java.util.ArrayList;
import co.bank.bbva.application.model.Contacto;


//SERVICE IMPLEMENTADO REPOSITORY
public class ContactoDAO implements Crud<Contacto> {

    private ArrayList<Contacto> contactList;

    public ContactoDAO() {
        this.contactList = new ArrayList<>();
    }

    @Override
    public boolean add(Contacto entity) {
        if (entity != null) {
             contactList.add(entity);
             return false;
        }
        return false;
    }



    @Override
    public boolean update(int index, Contacto entity) {
        if (index >= 0 && index < contactList.size() && entity != null) {
            contactList.set(index, entity);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int index) {
        if (index >= 0 && index < contactList.size()) {
            contactList.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Contacto> readAll() {
        return contactList;
    }

	@Override
	public Contacto read(int index) {
		// TODO Auto-generated method stub
		return null;
	}
}
