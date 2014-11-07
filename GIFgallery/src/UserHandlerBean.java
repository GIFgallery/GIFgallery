import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class UserHandlerBean {

	private String getUserName = "test user";
	
	public String getGetUserName() {
		return getUserName;
	}
	
	public void setGetUserName(String getUserName) {
		this.getUserName = getUserName;
	}
	
}
