import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;

@ManagedBean
@SessionScoped
public class FileUploadView {
	

	public void handleFileUpload(FileUploadEvent event) {
		FacesMessage message = new FacesMessage("Succesful",
		event.getFile().getFileName() + " is uploaded.");
		System.out.println("File uploaded: " + event.getFile().getFileName());
		// FacesContext.getCurrentInstance().addMessage(null, message);
		
		// write into db file name
		System.out.println("asdf");
	}
}