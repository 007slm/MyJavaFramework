package com.justep.p.inverse.org;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import org.hibernate.annotations.GenericGenerator;

/**
 * AbstractSaOporg entity provides the base persistence definition of the
 * SaOporg entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractSaOporg implements java.io.Serializable {

	// Fields

	private String sid;
	private long version;
	private String sname;
	private String scode;
	private String sshortname;
	private String sfname;
	private String sfcode;
	private String sfid;
	private String sorgkindid;
	private long ssequence;
	private long svalidstate;
	private String sparent;
	private long slevel;
	private String sphone;
	private String sfax;
	private String saddress;
	private String szip;
	private String sdescription;

	// Constructors

	/** default constructor */
	public AbstractSaOporg() {
	}

	/** minimal constructor */
	public AbstractSaOporg(String scode, String sorgkindid) {
		this.scode = scode;
		this.sorgkindid = sorgkindid;
	}

	/** full constructor */
	public AbstractSaOporg(String sname, String scode, String sshortname,
			String sfname, String sfcode, String sfid, String sorgkindid,
			long ssequence, long svalidstate, String sparent, long slevel,
			String sphone, String sfax, String saddress, String szip,
			String sdescription) {
		this.sname = sname;
		this.scode = scode;
		this.sshortname = sshortname;
		this.sfname = sfname;
		this.sfcode = sfcode;
		this.sfid = sfid;
		this.sorgkindid = sorgkindid;
		this.ssequence = ssequence;
		this.svalidstate = svalidstate;
		this.sparent = sparent;
		this.slevel = slevel;
		this.sphone = sphone;
		this.sfax = sfax;
		this.saddress = saddress;
		this.szip = szip;
		this.sdescription = sdescription;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "uuid.string")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "SID", unique = true, nullable = false, length = 36)
	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	@Version
	@Column(name = "VERSION", precision = 22, scale = 0)
	public long getVersion() {
		return this.version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	@Column(name = "SNAME", length = 64)
	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Column(name = "SCODE", nullable = false, length = 64)
	public String getScode() {
		return this.scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	@Column(name = "SSHORTNAME")
	public String getSshortname() {
		return this.sshortname;
	}

	public void setSshortname(String sshortname) {
		this.sshortname = sshortname;
	}

	@Column(name = "SFNAME", length = 1024)
	public String getSfname() {
		return this.sfname;
	}

	public void setSfname(String sfname) {
		this.sfname = sfname;
	}

	@Column(name = "SFCODE", length = 720)
	public String getSfcode() {
		return this.sfcode;
	}

	public void setSfcode(String sfcode) {
		this.sfcode = sfcode;
	}

	@Column(name = "SFID", length = 360)
	public String getSfid() {
		return this.sfid;
	}

	public void setSfid(String sfid) {
		this.sfid = sfid;
	}

	@Column(name = "SORGKINDID", nullable = false, length = 36)
	public String getSorgkindid() {
		return this.sorgkindid;
	}

	public void setSorgkindid(String sorgkindid) {
		this.sorgkindid = sorgkindid;
	}

	@Column(name = "SSEQUENCE", precision = 22, scale = 0)
	public long getSsequence() {
		return this.ssequence;
	}

	public void setSsequence(long ssequence) {
		this.ssequence = ssequence;
	}

	@Column(name = "SVALIDSTATE", precision = 22, scale = 0)
	public long getSvalidstate() {
		return this.svalidstate;
	}

	public void setSvalidstate(long svalidstate) {
		this.svalidstate = svalidstate;
	}

	@Column(name = "SPARENT", length = 36)
	public String getSparent() {
		return this.sparent;
	}

	public void setSparent(String sparent) {
		this.sparent = sparent;
	}

	@Column(name = "SLEVEL", precision = 22, scale = 0)
	public long getSlevel() {
		return this.slevel;
	}

	public void setSlevel(long slevel) {
		this.slevel = slevel;
	}

	@Column(name = "SPHONE", length = 64)
	public String getSphone() {
		return this.sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	@Column(name = "SFAX", length = 64)
	public String getSfax() {
		return this.sfax;
	}

	public void setSfax(String sfax) {
		this.sfax = sfax;
	}

	@Column(name = "SADDRESS")
	public String getSaddress() {
		return this.saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	@Column(name = "SZIP", length = 16)
	public String getSzip() {
		return this.szip;
	}

	public void setSzip(String szip) {
		this.szip = szip;
	}

	@Column(name = "SDESCRIPTION")
	public String getSdescription() {
		return this.sdescription;
	}

	public void setSdescription(String sdescription) {
		this.sdescription = sdescription;
	}

}