package libreria;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.libreria.model.Categoria;
import com.libreria.services.CategoriaSvrImp;
@ManagedBean(name="mBcat")
@ViewScoped
public class MBCategorias implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Categoria> catlist=null;
    List<Categoria> catlisf=null;
    Categoria catsel=null;
    CategoriaSvrImp catsvr = new CategoriaSvrImp();
    @PostConstruct
	public void init(){
		listar();
	}
    public void guardar(){
    	
    }
    public void actualizar(){
    	
    }
    
	private void listar(){
		catlist = catsvr.findAll();
	}
	public List<Categoria> getCatlist() {
		return catlist;
	}
	public void setCatlist(List<Categoria> catlist) {
		this.catlist = catlist;
	}
	public List<Categoria> getCatlisf() {
		return catlisf;
	}
	public void setCatlisf(List<Categoria> catlisf) {
		this.catlisf = catlisf;
	}
	public Categoria getCatsel() {
		return catsel;
	}
	public void setCatsel(Categoria catsel) {
		this.catsel = catsel;
	}
	
	
}