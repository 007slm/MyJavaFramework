package com.justep.p.inverse.org;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * SaOporg entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SA_OPORG", schema = "X5SSO")
public class SaOporg extends AbstractSaOporg implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SaOporg() {
	}

	/** minimal constructor */
	public SaOporg(String scode, String sorgkindid) {
		super(scode, sorgkindid);
	}

	/** full constructor */
	public SaOporg(String sname, String scode, String sshortname,
			String sfname, String sfcode, String sfid, String sorgkindid,
			long ssequence, long svalidstate, String sparent, long slevel,
			String sphone, String sfax, String saddress, String szip,
			String sdescription) {
		super(sname, scode, sshortname, sfname, sfcode, sfid, sorgkindid,
				ssequence, svalidstate, sparent, slevel, sphone, sfax,
				saddress, szip, sdescription);
	}

}
