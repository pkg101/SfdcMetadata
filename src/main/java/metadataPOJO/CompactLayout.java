package metadataPOJO;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CompactLayout {
	private String id;
	private String developerName;
	private String lastModifiedDate;
	private String sobjectType;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDeveloperName() {
		return developerName;
	}
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}
	public String getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public String getSobjectType() {
		return sobjectType;
	}
	public void setSobjectType(String sobjectType) {
		this.sobjectType = sobjectType;
	}
	
	
}
