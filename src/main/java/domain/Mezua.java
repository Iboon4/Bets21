package domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@Entity
public class Mezua {

	@Id 
	@XmlJavaTypeAdapter(IntegerAdapter.class)
	@GeneratedValue
	private Integer MezuId;
	@XmlIDREF
	User User1;
	@XmlIDREF
	User User2;
	String mezua;
	
	public Mezua(User igorlea, User hartzailea, String mezua) {
		super();
		this.User1 = igorlea;
		this.User2 = hartzailea;
		this.mezua = mezua;
	}
	public Mezua(Integer mezuId, User igorlea, User hartzailea, String mezua) {
		super();
		MezuId = mezuId;
		this.User1 = igorlea;
		this.User2 = hartzailea;
		this.mezua = mezua;
	}
	public Integer getMezuId() {
		return MezuId;
	}
	public void setMezuId(Integer mezuId) {
		MezuId = mezuId;
	}
	public User getIgorlea() {
		return User1;
	}
	public void setIgorlea(User igorlea) {
		this.User1 = igorlea;
	}
	public User getHartzailea() {
		return User2;
	}
	public void setHartzailea(User hartzailea) {
		this.User2 = hartzailea;
	}
	public String getMezua() {
		return mezua;
	}
	public void setMezua(String mezua) {
		this.mezua = mezua;
	}
	public boolean equals(Mezua obj) {
		if(this.mezua.equals(obj.mezua) && this.User1.equals(obj.User1) && this.User2.equals(obj.User2)) {
			return true;
		} else return false;
	}
}
