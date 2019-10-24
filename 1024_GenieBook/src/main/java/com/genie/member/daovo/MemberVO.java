package com.genie.member.daovo;


import java.util.Date;

public class MemberVO {

	private int memNo;
	private String id;
	private String pw;
	private String memName;
	private String regType;
	private Date birth;
	private String email;
	private String phone;
	private String gender; 
	private String addrCode;
	private String addr;
	private String addrDetail;
	private Date regDate;
	private int point;
	
	// 디폴트 생성자
	public MemberVO() {
		super();
	}

	// 생성자
	public MemberVO(int memNo, String id, String pw, String memName, String regType, Date birth, String email, String phone,
			String gender, String addrCode, String addr, String addrDetail, Date regDate, int point) {
		super();
		this.memNo = memNo;
		this.id = id;
		this.pw = pw;
		this.memName = memName;
		this.regType = regType;
		this.birth = birth;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.addrCode = addrCode;
		this.addr = addr;
		this.addrDetail = addrDetail;
		this.regDate = regDate;
		this.point = point;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}
	
	public String getRegType() {
		return regType;
	}

	public void setRegType(String regType) {
		this.regType = regType;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddrCode() {
		return addrCode;
	}

	public void setAddrCode(String addrCode) {
		this.addrCode = addrCode;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAddrDetail() {
		return addrDetail;
	}

	public void setAddrDetail(String addrDetail) {
		this.addrDetail = addrDetail;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
}
