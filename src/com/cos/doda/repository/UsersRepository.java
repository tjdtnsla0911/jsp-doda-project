package com.cos.doda.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cos.doda.db.DBConn;
import com.cos.doda.model.DodaKaitou;
import com.cos.doda.model.DodaKasha;
import com.cos.doda.model.DodaRirekishou;
import com.cos.doda.model.DodaSaveMyKaisha;
import com.cos.doda.model.DodaTensu;
import com.cos.doda.model.DodaUser;
import com.cos.doda.model.DodaUserHensin;
import com.cos.doda.model.DodaUserSodan;
import com.cos.doda.model.Dodasukauto;
import com.cos.doda.model.ipip;
import com.sun.org.apache.regexp.internal.recompile;



// DAO
public class UsersRepository {
	static int ok=5;
	static int sum=5;
	static int page=1;
	private static final String TAG = "UsersRepository : ";
	private static UsersRepository instance = new UsersRepository();
	private UsersRepository() {}
	public static UsersRepository getInstance() {
		return instance;
	}

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	public DodaKasha seleteKaisha(int id) {
		final String SQL = "SELECT * from kaisha where random=?";
		DodaKasha dodakaisha = null;


		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);

			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();
			while(rs.next()) {
				dodakaisha = new DodaKasha();
				dodakaisha.setKaishaname(rs.getString("kaishaname"));
				dodakaisha.setPay(rs.getString("pay"));
				dodakaisha.setPeoples(rs.getString("peoples"));
				dodakaisha.setSince(rs.getString("since"));
				dodakaisha.setIntroduction(rs.getString("introduction"));
				dodakaisha.setImg(rs.getString("img"));
				dodakaisha.setJob(rs.getString("job"));
				dodakaisha.setArea(rs.getString("area"));
				dodakaisha.setPeople(rs.getString("people"));
				dodakaisha.setSchool(rs.getString("school"));
				dodakaisha.setTime(rs.getString("time"));
				dodakaisha.setDay(rs.getString("company"));
				dodakaisha.setCreatedate(rs.getTimestamp("createdate"));
				dodakaisha.setRandom(rs.getInt("random"));




			}


			return dodakaisha;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsernameAndPassword : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}


	public int findByUsername(String username) {
		final String SQL = "SELECT count(*) FROM dodauser WHERE userid = ?";
		DodaUser user = null;

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setString(1, username);
			// if 돌려서 rs -> java오브젝트에 집어넣기
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getInt(1); // 0 or 1
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsername : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return -1;
	}



	public int myupup(String ip) {
		final String SQL = "SELECT count(*) FROM ipip WHERE ip = ?";
		 ipip user = null;

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setString(1, ip);
			// if 돌려서 rs -> java오브젝트에 집어넣기
			rs = pstmt.executeQuery();

			if(rs.next()) {
				return rs.getInt(1); // 0 or 1
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsername : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return -1;
	}
//seleteDodaKaitou
	public DodaUser findByUsernameAndPassword(String username, String password) {
		final String SQL = "SELECT name, userid,  email, address, tell, id,password,style FROM dodauser WHERE userid = ? AND password = ?";
		DodaUser user = null;

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			// if 돌려서 rs -> java오브젝트에 집어넣기
			rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new DodaUser();
				user.setName(rs.getString("name"));
				user.setUserid(rs.getString("userid"));
				user.setEmail(rs.getString("email"));
				user.setAddress(rs.getString("address"));
				user.setTell(rs.getString("tell"));
				user.setId(rs.getInt("id"));
				user.setPassword(rs.getString("password"));
				user.setStyle(rs.getString("style"));
			}

			return user;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsernameAndPassword : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}
	////////////////////////////////////////////////
	public DodaUser findByUsernameAndPassword(String username) {
		final String SQL = "SELECT name, userid,  email, address, tell, id,password,style FROM dodauser WHERE userid = ?";
		DodaUser user = null;

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setString(1, username);

			// if 돌려서 rs -> java오브젝트에 집어넣기
			rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new DodaUser();
				user.setName(rs.getString("name"));
				user.setUserid(rs.getString("userid"));
				user.setEmail(rs.getString("email"));
				user.setAddress(rs.getString("address"));
				user.setTell(rs.getString("tell"));
				user.setId(rs.getInt("id"));
				user.setPassword(rs.getString("password"));
				user.setStyle(rs.getString("style"));
			}

			return user;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsernameAndPassword : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}
	////////////////////////////////////////////////
	//seleteDodaKaitou
	public List<DodaKaitou> seleteDodaKaitou(int id) {
		final String SQL = "SELECT name,title,hensin,id,createdate,kaitounumber,kanrinumber from kaitou where id=?";
		DodaKaitou dodakaitou = null;
		List<DodaKaitou> dodakaitou2=new ArrayList<>();


		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);

			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();
			while(rs.next()) {
				dodakaitou = new DodaKaitou();
				dodakaitou.setName(rs.getString("name"));
				dodakaitou.setTitle(rs.getString("title"));
				dodakaitou.setHensin(rs.getString("hensin"));
				dodakaitou.setId(rs.getInt("id"));
				dodakaitou.setCreatedate(rs.getTimestamp("createdate"));
				dodakaitou.setKaitounumber(rs.getInt("kaitounumber"));
				dodakaitou.setKanrinumber(rs.getInt("kanrinumber"));



				dodakaitou2.add(dodakaitou);
			}


			return dodakaitou2;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsernameAndPassword : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}

	/////////////////////////
	public DodaKaitou seleteDodaKaitou2(int kaitounumber) {
		final String SQL = "SELECT name,title,hensin,id,createdate,kaitounumber,kanrinumber from kaitou where kaitounumber=?";
		DodaKaitou dodakaitou = null;



		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);

			pstmt.setInt(1, kaitounumber);

			rs = pstmt.executeQuery();
			while(rs.next()) {
				dodakaitou = new DodaKaitou();
				dodakaitou.setName(rs.getString("name"));
				dodakaitou.setTitle(rs.getString("title"));
				dodakaitou.setHensin(rs.getString("hensin"));
				dodakaitou.setId(rs.getInt("id"));
				dodakaitou.setCreatedate(rs.getTimestamp("createdate"));
				dodakaitou.setKaitounumber(rs.getInt("kaitounumber"));
				dodakaitou.setKanrinumber(rs.getInt("kanrinumber"));



			}


			return dodakaitou;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsernameAndPassword : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}
	///////////////
	public List<DodaKasha> findByKaisha(String job, String area,String pay) {
		final String SQL = "SELECT * FROM kaisha WHERE job=? AND area = ? and pay=?";
		DodaKasha dodakasha = null;
		List<DodaKasha> dodaKasha2=new ArrayList<>();


		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);

			pstmt.setString(1, job);
			pstmt.setString(2, area);
			pstmt.setString(3, pay);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dodakasha = new DodaKasha();
				dodakasha.setKaishaname(rs.getString("kaishaname"));
				dodakasha.setPay(rs.getString("pay"));
				dodakasha.setPeoples(rs.getString("peoples"));
				dodakasha.setSince(rs.getString("since"));
				dodakasha.setIntroduction(rs.getString("introduction"));
				dodakasha.setJob(rs.getString("job"));
				dodakasha.setArea(rs.getString("area"));
				dodakasha.setPeople(rs.getString("people"));
				dodakasha.setImg(rs.getString("img"));
				dodakasha.setDay(rs.getString("day"));
				dodakasha.setTime(rs.getString("time"));
				dodakasha.setSchool(rs.getString("school"));
				dodakasha.setCompany(rs.getString("company"));
				dodakasha.setCreatedate(rs.getTimestamp("createdate"));
				dodakasha.setRandom(rs.getInt("random"));


				dodaKasha2.add(dodakasha);
			}


			return dodaKasha2;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsernameAndPassword : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}

	public List<DodaKasha> findByKaisha() {
		final String SQL = "SELECT * FROM kaisha";
		DodaKasha dodakasha = null;
		List<DodaKasha> dodaKasha2=new ArrayList<>();


		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);

			rs = pstmt.executeQuery();
			while(rs.next()) {
				dodakasha = new DodaKasha();
				dodakasha.setKaishaname(rs.getString("kaishaname"));
				dodakasha.setPay(rs.getString("pay"));
				dodakasha.setPeoples(rs.getString("peoples"));
				dodakasha.setSince(rs.getString("since"));
				dodakasha.setIntroduction(rs.getString("introduction"));
				dodakasha.setJob(rs.getString("job"));
				dodakasha.setArea(rs.getString("area"));
				dodakasha.setPeople(rs.getString("people"));
				dodakasha.setImg(rs.getString("img"));
				dodakasha.setDay(rs.getString("day"));
				dodakasha.setTime(rs.getString("time"));
				dodakasha.setSchool(rs.getString("school"));
				dodakasha.setCompany(rs.getString("company"));
				dodakasha.setCreatedate(rs.getTimestamp("createdate"));
				dodakasha.setRandom(rs.getInt("random"));


				dodaKasha2.add(dodakasha);
			}


			return dodaKasha2;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsernameAndPassword : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}

	public List<DodaKasha> findByKaisha(String area,String pay) {
		final String SQL = "SELECT * FROM kaisha WHERE area = ? and pay=?";
		DodaKasha dodakasha = null;
		List<DodaKasha> dodaKasha2=new ArrayList<>();


		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);


			pstmt.setString(1, area);
			pstmt.setString(2, pay);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dodakasha = new DodaKasha();
				dodakasha.setKaishaname(rs.getString("kaishaname"));
				dodakasha.setPay(rs.getString("pay"));
				dodakasha.setPeoples(rs.getString("peoples"));
				dodakasha.setSince(rs.getString("since"));
				dodakasha.setIntroduction(rs.getString("introduction"));
				dodakasha.setJob(rs.getString("job"));
				dodakasha.setArea(rs.getString("area"));
				dodakasha.setPeople(rs.getString("people"));
				dodakasha.setImg(rs.getString("img"));
				dodakasha.setDay(rs.getString("day"));
				dodakasha.setTime(rs.getString("time"));
				dodakasha.setSchool(rs.getString("school"));
				dodakasha.setCompany(rs.getString("company"));
				dodakasha.setCreatedate(rs.getTimestamp("createdate"));
				dodakasha.setRandom(rs.getInt("random"));


				dodaKasha2.add(dodakasha);
			}


			return dodaKasha2;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsernameAndPassword : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}
	///////////////////////////
	public List<DodaUserHensin> findDodaUserHensin(int id) {
	final String SQL = "SELECT * FROM userhensin WHERE kanrinumber = ?";
	DodaUserHensin dodakasha = null;
	List<DodaUserHensin> dodaKasha2=new ArrayList<>();


	try {
		conn = DBConn.getConnection();
		pstmt = conn.prepareStatement(SQL);

		pstmt.setInt(1, id);

		rs = pstmt.executeQuery();
		while(rs.next()) {
			dodakasha = new DodaUserHensin();
			dodakasha.setTitle(rs.getString("title"));
			dodakasha.setHensin(rs.getString("hensin"));
			dodakasha.setId(rs.getInt("id"));
			dodakasha.setKaitounumber(rs.getInt("kaitounumber"));
			dodakasha.setKanrinumber(rs.getInt("kanrinumber"));
			dodakasha.setKanrititle(rs.getString("kanrititle"));



			dodaKasha2.add(dodakasha);
		}


		return dodaKasha2;
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println(TAG+"findByUsernameAndPassword : "+e.getMessage());
	} finally {
		DBConn.close(conn, pstmt, rs);
	}

	return null;
}
////////////////
	public DodaKasha findByKaisha(int i) {
		final String SQL = "SELECT * from kaisha where random = ?";
		DodaKasha dodakasha = null;



		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);

			pstmt.setInt(1, i);

			rs = pstmt.executeQuery();
			while(rs.next()) {
				dodakasha = new DodaKasha();
				dodakasha.setKaishaname(rs.getString("kaishaname"));
				dodakasha.setPay(rs.getString("pay"));
				dodakasha.setPeoples(rs.getString("peoples"));
				dodakasha.setSince(rs.getString("since"));
				dodakasha.setIntroduction(rs.getString("introduction"));
				dodakasha.setJob(rs.getString("job"));
				dodakasha.setArea(rs.getString("area"));
				dodakasha.setPeople(rs.getString("people"));
				dodakasha.setImg(rs.getString("img"));
				dodakasha.setDay(rs.getString("day"));
				dodakasha.setTime(rs.getString("time"));
				dodakasha.setSchool(rs.getString("school"));
				dodakasha.setCompany(rs.getString("company"));
				dodakasha.setCreatedate(rs.getTimestamp("createdate"));
				dodakasha.setRandom(rs.getInt("random"));



			}


			return dodakasha;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsernameAndPassword : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}
	public List<DodaKasha> findByKaisha(String day, String school,String company,String sigoto,String area,String money,String time) {
		final String SQL = "SELECT * from kaisha WHERE day=? AND  school= ? and company =? and job =? and area = ? and pay =? and time =?";
		DodaKasha dodakasha = null;
		List<DodaKasha> dodaKasha2=new ArrayList<>();


		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);

			pstmt.setString(1, day);
			pstmt.setString(2, school);
			pstmt.setString(3, company);
			pstmt.setString(4, sigoto);
			pstmt.setString(5, area);
			pstmt.setString(6, money);
			pstmt.setString(7, time);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				dodakasha = new DodaKasha();
				dodakasha.setKaishaname(rs.getString("kaishaname"));
				dodakasha.setPay(rs.getString("pay"));
				dodakasha.setPeoples(rs.getString("peoples"));
				dodakasha.setSince(rs.getString("since"));
				dodakasha.setIntroduction(rs.getString("introduction"));
				dodakasha.setJob(rs.getString("job"));
				dodakasha.setArea(rs.getString("area"));
				dodakasha.setPeople(rs.getString("people"));
				dodakasha.setImg(rs.getString("img"));
				dodakasha.setDay(rs.getString("day"));
				dodakasha.setSchool(rs.getString("school"));
				dodakasha.setCompany(rs.getString("company"));
				dodakasha.setTime(rs.getString("time"));
				dodakasha.setCreatedate(rs.getTimestamp("createdate"));


				dodaKasha2.add(dodakasha);
			}


			return dodaKasha2;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsernameAndPassword : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}

	public List<ipip> seleteipip() {
		final String SQL = "SELECT * from ipip";
		ipip dodakasha = null;
		List<ipip> dodaKasha2=new ArrayList<>();


		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);


			rs = pstmt.executeQuery();
			while(rs.next()) {
				dodakasha = new ipip();
				dodakasha.setIp(rs.getString("ip"));
				dodakasha.setCreatedate(rs.getTimestamp("createdate"));
				dodaKasha2.add(dodakasha);
			}


			return dodaKasha2;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsernameAndPassword : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}


	public DodaUser findByUsernameAndPasswordid(int userid) {
		final String SQL = "SELECT name, userid,  email, address, tell,id, password FROM dodauser WHERE id = ?";
		DodaUser user = null;

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setInt(1, userid);

			// if 돌려서 rs -> java오브젝트에 집어넣기
			rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new DodaUser();
				user.setName(rs.getString("name"));
				user.setUserid(rs.getString("userid"));
				user.setEmail(rs.getString("address"));
				user.setTell(rs.getString("tell"));
				user.setId(rs.getInt("id"));
				user.setPassword(rs.getString("password"));
			}

			return user;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsernameAndPassword : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}


	public DodaUser findByUsernameAndPassword(int id) {
		final String SQL = "SELECT name, userid,  email, address, tell,id,password,style FROM dodauser WHERE id = ?";
		DodaUser user = null;

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setInt(1,id);

			// if 돌려서 rs -> java오브젝트에 집어넣기
			rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new DodaUser();
				user.setName(rs.getString("name"));
				user.setUserid(rs.getString("userid"));
				user.setEmail(rs.getString("email"));
				user.setEmail(rs.getString("address"));
				user.setTell(rs.getString("tell"));
				user.setId(rs.getInt("id"));
				user.setPassword(rs.getString("password"));
				user.setStyle(rs.getString("style"));
			}

			return user;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsernameAndPassword : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}



	public int save(DodaUser dodauser) {
		final String SQL = "INSERT INTO dodauser(name,userid,password,email,address,tell,id,style) VALUES(?,?,?,?,?,?,doda_seq.nextval,?)";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setString(1, dodauser.getName());
			pstmt.setString(2, dodauser.getUserid());
			pstmt.setString(3, dodauser.getPassword());
			pstmt.setString(4, dodauser.getEmail());
			pstmt.setString(5, dodauser.getAddress());
			pstmt.setString(6, dodauser.getTell());
			pstmt.setString(7, dodauser.getStyle());

			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"save : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}

	public int saveipip(String ip) {
		final String SQL = "INSERT INTO ipip(ip,createdate) VALUES(?,sysdate)";


		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setString(1, ip);


			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"save : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}



	public int savesukauto(Dodasukauto dodasukauto) {
		//final String SQL = "INSERT INTO dodauser(name,userid,password,email,address,tell,id,style) VALUES(?,?,?,?,?,?,doda_seq.nextval,?)";
		final String SQL ="insert into sukauto(name,age,sex,wantpay,nowjob,nowpay,keireki,area,id,createdate) values(?,?,?,?,?,?,?,?,?,sysdate)";
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setString(1, dodasukauto.getName());
			pstmt.setString(2, dodasukauto.getAge());
			pstmt.setString(3, dodasukauto.getSex());
			pstmt.setString(4, dodasukauto.getWantpay());
			pstmt.setString(5, dodasukauto.getNowjob());
			pstmt.setString(6, dodasukauto.getNowpay());
			pstmt.setString(7, dodasukauto.getKeireki());
			pstmt.setString(8, dodasukauto.getArea());
			pstmt.setInt(9, dodasukauto.getId());

			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"save : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}


	public int save(DodaUserHensin dodaUserHensin) {
		final String SQL = "INSERT INTO userhensin(title,hensin,id,kaitounumber,kanrinumber,kanrititle) VALUES(?,?,?,?,?,?)";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setString(1, dodaUserHensin.getTitle());
			pstmt.setString(2, dodaUserHensin.getHensin());
			pstmt.setInt(3, dodaUserHensin.getId());
			pstmt.setInt(4, dodaUserHensin.getKaitounumber());
			pstmt.setInt(5, dodaUserHensin.getKanrinumber());
			pstmt.setString(6, dodaUserHensin.getKanrititle());

			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"save : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}
	public int saveMyKaisha(DodaSaveMyKaisha dodaSavemykaisha) {
		final String SQL = "INSERT INTO savamykaisha(random,userid,pay,area,time,img,kaishaname,job,createdate) VALUES(?,?,?,?,?,?,?,?,sysdate)";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setInt(1, dodaSavemykaisha.getRandom());
			pstmt.setInt(2,dodaSavemykaisha.getUserid() );
			pstmt.setString(3, dodaSavemykaisha.getPay());
			pstmt.setString(4, dodaSavemykaisha.getArea());
			pstmt.setString(5, dodaSavemykaisha.getTime());
			pstmt.setString(6, dodaSavemykaisha.getImg());
			pstmt.setString(7, dodaSavemykaisha.getKaishaname());
			pstmt.setString(8, dodaSavemykaisha.getJob());




			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"save : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}
	////////
	public List<DodaSaveMyKaisha> seleteMyKaisha(int id) {
		final String SQL = "SELECT random,userid,pay,area,time,createdate,img,kaishaname,job from savamykaisha where userid=?";
		DodaSaveMyKaisha dodaSaveMyKaisha = null;
		List<DodaSaveMyKaisha> dodaSaveMyKaisha2=new ArrayList<>();


		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);

			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();
			while(rs.next()) {
				dodaSaveMyKaisha= new DodaSaveMyKaisha();//개시발놈 new안하면 안댐 시발꺼
				dodaSaveMyKaisha.setRandom(rs.getInt("random"));
				dodaSaveMyKaisha.setUserid(rs.getInt("userid"));
				dodaSaveMyKaisha.setPay(rs.getString("pay"));
				dodaSaveMyKaisha.setArea(rs.getString("area"));
				dodaSaveMyKaisha.setTime(rs.getString("time"));
				dodaSaveMyKaisha.setCreatedate(rs.getTimestamp("createdate"));
				dodaSaveMyKaisha.setImg(rs.getString("img"));
				dodaSaveMyKaisha.setKaishaname(rs.getString("kaishaname"));
				dodaSaveMyKaisha.setJob(rs.getString("job"));



				dodaSaveMyKaisha2.add(dodaSaveMyKaisha);
			}


			return dodaSaveMyKaisha2;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsernameAndPassword : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}////
	/////////////

	public List<DodaRirekishou> seleteRirekishou(int id) {
		final String SQL = "SELECT * from rirekishou where id=?";
		DodaRirekishou dodaSaveMyKaisha = null;
		List<DodaRirekishou> dodaSaveMyKaisha2=new ArrayList<>();


		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);

			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();
			while(rs.next()) {
				dodaSaveMyKaisha= new DodaRirekishou();//개시발놈 new안하면 안댐 시발꺼
				dodaSaveMyKaisha.setKoreaname(rs.getString("koreaname"));
				dodaSaveMyKaisha.setBirthday(rs.getString("birthday"));
				dodaSaveMyKaisha.setEmail(rs.getString("email"));
				dodaSaveMyKaisha.setKanjiname(rs.getString("kanjiname"));
				dodaSaveMyKaisha.setAddress(rs.getString("address"));
				dodaSaveMyKaisha.setTell(rs.getString("tell"));
				dodaSaveMyKaisha.setTell2(rs.getString("tell2"));
				dodaSaveMyKaisha.setKauki1(rs.getString("kauki1"));
				dodaSaveMyKaisha.setKauki2(rs.getString("kauki2"));
				dodaSaveMyKaisha.setKauki3(rs.getString("kauki3"));
				dodaSaveMyKaisha.setKigen1(rs.getString("kigen1"));
				dodaSaveMyKaisha.setKigen2(rs.getString("kigen2"));
				dodaSaveMyKaisha.setKigen3(rs.getString("kigen3"));
				dodaSaveMyKaisha.setGatko1(rs.getString("gatko1"));
				dodaSaveMyKaisha.setGatko2(rs.getString("gatko2"));
				dodaSaveMyKaisha.setGatko3(rs.getString("gatko3"));
				dodaSaveMyKaisha.setSotugyou1(rs.getString("sotugyou1"));
				dodaSaveMyKaisha.setSotugyou2(rs.getString("sotugyou2"));
				dodaSaveMyKaisha.setSotugyou3(rs.getString("sotugyou3"));
				dodaSaveMyKaisha.setSenko1(rs.getString("senko1"));
				dodaSaveMyKaisha.setSenko2(rs.getString("senko2"));
				dodaSaveMyKaisha.setSenko3(rs.getString("senko3"));
				dodaSaveMyKaisha.setBigo1(rs.getString("bigo1"));
				dodaSaveMyKaisha.setBigo2(rs.getString("bigo2"));
				dodaSaveMyKaisha.setBigo3(rs.getString("bigo3"));
				dodaSaveMyKaisha.setKeireki1(rs.getString("keireki1"));
				dodaSaveMyKaisha.setKeireki2(rs.getString("keireki2"));
				dodaSaveMyKaisha.setKeireki3(rs.getString("keireki3"));
				dodaSaveMyKaisha.setKeirekikigen1(rs.getString("keirekikigen1"));
				dodaSaveMyKaisha.setKeirekikigen2(rs.getString("keirekikigen2"));
				dodaSaveMyKaisha.setKeirekikigen3(rs.getString("keirekikigen3"));
				dodaSaveMyKaisha.setSanko(rs.getString("sanko"));
				dodaSaveMyKaisha.setDay(rs.getString("day"));
				dodaSaveMyKaisha.setId(rs.getInt("id"));
				dodaSaveMyKaisha.setCreatedate(rs.getTimestamp("createdate"));
				dodaSaveMyKaisha.setImg(rs.getString("img"));
				dodaSaveMyKaisha.setKinmu1(rs.getString("kinmu1"));
				dodaSaveMyKaisha.setKinmu2(rs.getString("kinmu2"));
				dodaSaveMyKaisha.setKinmu3(rs.getString("kinmu3"));
				dodaSaveMyKaisha.setLevel1(rs.getString("level1"));
				dodaSaveMyKaisha.setLevel2(rs.getString("level2"));
				dodaSaveMyKaisha.setLevel3(rs.getString("level3"));
				dodaSaveMyKaisha.setSikaku1(rs.getString("sikaku1"));
				dodaSaveMyKaisha.setSikaku2(rs.getString("sikaku2"));
				dodaSaveMyKaisha.setSikaku3(rs.getString("sikaku3"));
//				pstmt.setString(35, dodaKasha.getKinmu1());
//				pstmt.setString(36, dodaKasha.getKinmu2());
//				pstmt.setString(37, dodaKasha.getKinmu3());
//				pstmt.setString(38, dodaKasha.getLevel1());
//				pstmt.setString(39, dodaKasha.getLevel2());
//				pstmt.setString(40, dodaKasha.getLevel3());
//				pstmt.setString(41, dodaKasha.getSikaku1());
//				pstmt.setString(42, dodaKasha.getSikaku2());
//				pstmt.setString(43, dodaKasha.getSikaku3());






				dodaSaveMyKaisha2.add(dodaSaveMyKaisha);
			}


			return dodaSaveMyKaisha2;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsernameAndPassword : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}////

	//////////////////


	public List<Dodasukauto> seleteDodasukauto() {
		final String SQL = "SELECT * from sukauto";
		Dodasukauto dodaSaveMyKaisha = null;
		List<Dodasukauto> dodaSaveMyKaisha2=new ArrayList<>();


		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);



			rs = pstmt.executeQuery();
			while(rs.next()) {
				dodaSaveMyKaisha= new Dodasukauto();//개시발놈 new안하면 안댐 시발꺼
				dodaSaveMyKaisha.setName(rs.getString("name"));
				dodaSaveMyKaisha.setAge(rs.getString("age"));
				dodaSaveMyKaisha.setSex(rs.getString("sex"));
				dodaSaveMyKaisha.setWantpay(rs.getString("wantpay"));
				dodaSaveMyKaisha.setNowjob(rs.getString("nowjob"));
				dodaSaveMyKaisha.setNowpay(rs.getString("nowpay"));
				dodaSaveMyKaisha.setKeireki(rs.getString("keireki"));
				dodaSaveMyKaisha.setArea(rs.getString("area"));
				dodaSaveMyKaisha.setCreatedate(rs.getTimestamp("createdate"));
				dodaSaveMyKaisha.setId(rs.getInt("id"));



				dodaSaveMyKaisha2.add(dodaSaveMyKaisha);
			}


			return dodaSaveMyKaisha2;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsernameAndPassword : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}
	////
	public int savekaisha(DodaKasha dodaKasha) {
		final String SQL = "INSERT INTO kaisha(kaishaname,pay,peoples,since,introduction,job,area,people,img,day,time,school,company,createdate,random) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate,kaisha_seq2.nextval)";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
		pstmt.setString(1, dodaKasha.getKaishaname());
		pstmt.setString(2, dodaKasha.getPay());
		pstmt.setString(3, dodaKasha.getPeoples());
		pstmt.setString(4, dodaKasha.getSince());
		pstmt.setString(5, dodaKasha.getIntroduction());
		pstmt.setString(6, dodaKasha.getJob());
		pstmt.setString(7, dodaKasha.getArea());
		pstmt.setString(8, dodaKasha.getPeople());
		pstmt.setString(9, dodaKasha.getImg());
		pstmt.setString(10, dodaKasha.getDay());
		pstmt.setString(11, dodaKasha.getTime());
		pstmt.setString(12, dodaKasha.getSchool());
		pstmt.setString(13, dodaKasha.getCompany());




		return pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"save : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}

//	(koreaname,birthday,email,kanjiname"
//			+ "address,tell,tell2,kauki1,kauki2,kauki3,kigen1,kigen2,kigen3,gatko1,gatko2,gatko3"
//			+ "sotugyou1,sotugyou2,sotugyou3,senko1,senko2,senko3,bigo1,bigo2,bigo3,keireki1,keireki2,keireki3,"
//			+ "keirekikigen1,keirekikigen2,keirekikigen3,sanko,gatday,img,createdate,id)
	public int saveRirekishou(DodaRirekishou dodaKasha) {
		final String SQL = "INSERT INTO rirekishou VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate,?,?,?,?,?,?,?,?,?,?,rirekishou_seq.nextval)";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setString(1, dodaKasha.getKoreaname());
			pstmt.setString(2, dodaKasha.getBirthday());
			pstmt.setString(3, dodaKasha.getEmail());
			pstmt.setString(4, dodaKasha.getKanjiname());
			pstmt.setString(5, dodaKasha.getAddress());
			pstmt.setString(6, dodaKasha.getTell());
			pstmt.setString(7, dodaKasha.getTell2());
			pstmt.setString(8, dodaKasha.getKauki1());
			pstmt.setString(9, dodaKasha.getKauki2());
			pstmt.setString(10, dodaKasha.getKauki3());
			pstmt.setString(11, dodaKasha.getKigen1());
			pstmt.setString(12, dodaKasha.getKigen2());
			pstmt.setString(13, dodaKasha.getKigen3());
			pstmt.setString(14, dodaKasha.getGatko1());
			pstmt.setString(15, dodaKasha.getGatko2());
			pstmt.setString(16, dodaKasha.getGatko3());
			pstmt.setString(17, dodaKasha.getSotugyou1());
			pstmt.setString(18, dodaKasha.getSotugyou2());
			pstmt.setString(19, dodaKasha.getSotugyou3());
			pstmt.setString(20, dodaKasha.getSenko1());
			pstmt.setString(21, dodaKasha.getSenko2());
			pstmt.setString(22, dodaKasha.getSenko3());
			pstmt.setString(23, dodaKasha.getBigo1());
			pstmt.setString(24, dodaKasha.getBigo2());
			pstmt.setString(25, dodaKasha.getBigo3());
			pstmt.setString(26, dodaKasha.getKeireki1());
			pstmt.setString(27, dodaKasha.getKeireki2());
			pstmt.setString(28, dodaKasha.getKeireki3());
			pstmt.setString(29, dodaKasha.getKeirekikigen1());
			pstmt.setString(30, dodaKasha.getKeirekikigen2());
			pstmt.setString(31, dodaKasha.getKeirekikigen3());
			pstmt.setString(32, dodaKasha.getSanko());
			pstmt.setString(33, dodaKasha.getDay());
			pstmt.setInt(34, dodaKasha.getId());
			pstmt.setString(35, dodaKasha.getImg());
			pstmt.setString(36, dodaKasha.getKinmu1());
			pstmt.setString(37, dodaKasha.getKinmu2());
			pstmt.setString(38, dodaKasha.getKinmu3());
			pstmt.setString(39, dodaKasha.getLevel1());
			pstmt.setString(40, dodaKasha.getLevel2());
			pstmt.setString(41, dodaKasha.getLevel3());
			pstmt.setString(42, dodaKasha.getSikaku1());
			pstmt.setString(43, dodaKasha.getSikaku2());
			pstmt.setString(44, dodaKasha.getSikaku3());



		return pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"save : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}
	public int saveDodaKaitou(DodaKaitou dodaKaitou) {
		final String SQL = "INSERT INTO kaitou(name,title,hensin,id,kanrinumber,createdate,kaitounumber) VALUES(?,?,?,?,?,sysdate,kaitou_seq.nextval)";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setString(1, dodaKaitou.getName());
			pstmt.setString(2, dodaKaitou.getTitle());
			pstmt.setString(3, dodaKaitou.getHensin());
			pstmt.setInt(4, dodaKaitou.getId());
			pstmt.setInt(5, dodaKaitou.getKanrinumber());


		return pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"save : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}
	public int savedodausersodan(DodaUserSodan dodausersodan) {
		final String SQL = "INSERT INTO dodausersodan(name,userid,email,tell,id,title,content,comid,createdate) VALUES(?,?,?,?,?,?,?,?,sysdate)";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
	pstmt.setString(1, dodausersodan.getName());
	pstmt.setString(2, dodausersodan.getUserid());
	pstmt.setString(3, dodausersodan.getEmail());
	pstmt.setString(4, dodausersodan.getTell());
	pstmt.setInt(5, dodausersodan.getId());
	pstmt.setString(6, dodausersodan.getTitle());
	pstmt.setString(7, dodausersodan.getContent());
	pstmt.setInt(8, dodausersodan.getComid());




		return pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"save : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}

	public int update(int id, String userProfile) {
		final String SQL = "UPDATE users SET userProfile = ? WHERE id = ?";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setString(1, userProfile);
			pstmt.setInt(2, id);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"update(id, userProfile) : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}

		return -1;
	}
	public DodaTensu tensu(int ok) {
		DodaTensu tensu=null;

		final String SQL = "select ok,no,sum,page,prs from tensu where ok=?";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, ok);
			rs = pstmt.executeQuery();
			if(rs.next()) {
			tensu = new DodaTensu();
			tensu.setOk(rs.getInt("ok"));
			tensu.setNo(rs.getInt("no"));
			tensu.setSum(rs.getInt("sum"));
			tensu.setPage(rs.getInt("page"));
			tensu.setPage(rs.getInt("prs"));
			}
			return tensu;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"update(id, userProfile) : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}

		return null;
	}
	public DodaTensu tensu(int ok,int sum,int page) {
		DodaTensu tensu=null;

		final String SQL = "select ok,sum,page from tensu";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);

			rs = pstmt.executeQuery();
			if(rs.next()) {
			tensu = new DodaTensu();
			tensu.setOk(rs.getInt("ok")+ok);
			tensu.setSum(rs.getInt("sum")+sum);
			tensu.setPage(rs.getInt("page")+page);
			}
			return tensu;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"update(id, userProfile) : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}

		return null;
	}
	public DodaTensu tensu(int sum,int page) {
		DodaTensu tensu=null;

		final String SQL = "select sum,page from tensu";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);

			rs = pstmt.executeQuery();
			if(rs.next()) {
			tensu = new DodaTensu();

			tensu.setSum(rs.getInt("sum")+sum);
			tensu.setPage(rs.getInt("page")+page);
			}
			return tensu;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"update(id, userProfile) : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}

		return null;
	}

	public int update(DodaUser dodauser) {
		final String SQL = "UPDATE users SET password = ?, email = ?, address = ? WHERE id = ?";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기
			pstmt.setString(1, dodauser.getPassword());
			pstmt.setString(2, dodauser.getEmail());
			pstmt.setString(3, dodauser.getAddress());
			pstmt.setInt(4, dodauser.getId());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"update : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}

		return -1;
	}

	public int deleteById(int comid) {

		final String SQL = "delete from dodausersodan where comid=?";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, comid);


			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"deleteById : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}

		return -1;
	}

	public int deleteByIp(String ip) {

		final String SQL = "delete from ipip where ip=?";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, ip);


			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"deleteById : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}

		return -1;
	}

	public int deletekaitou(int id) {

		final String SQL = "delete from kaitou where kaitounumber=?";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, id);


			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"deleteById : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt);
		}

		return -1;
	}

	public List<DodaUserSodan> findAll() {
		final String SQL = "select * from dodausersodan";
		List<DodaUserSodan> dodaUserSodans = new ArrayList<>();

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				DodaUserSodan dodaUserSodan = new DodaUserSodan(
				rs.getString("name"),
				rs.getString("userid"),
				rs.getString("email"),
				rs.getString("tell"),
				rs.getInt("id"),
				rs.getString("title"),
				rs.getString("content"),
				rs.getInt("comid"),
				rs.getTimestamp("createdate")

				);
				dodaUserSodans.add(dodaUserSodan);
			}

			return dodaUserSodans;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findAll : "+e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}


}
