import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.FileUploadEvent;

@ManagedBean
@SessionScoped
public class FileUploadView {
	

	public void handleFileUpload(FileUploadEvent event) {
		// FacesMessage message = new FacesMessage("Succesful",
		// event.getFile().getFileName() + " is uploaded.");
		// FacesContext.getCurrentInstance().addMessage(null, message);
		System.out.println("asdf");
	}
}