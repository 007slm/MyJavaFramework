package com.javaeye.i2534;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BaseDao<TestVO> dao = new BaseDao<TestVO>() {

			public Class<TestVO> getVOType() {
				return TestVO.class;
			}

			public Connection getConnection() {
				return ConnectionPool.getConnection();
			}

		};
		List<TestVO> list = dao.query(new Cnd(dao.getVOType()).where("time",
				OP.LESS_EQ, new Date()).and("flag", OP.EQ, '*').orderBy(
				"biaoShi", false).orderBy("time", true));
		for (TestVO vo : list) {
			System.out.println(vo.getBiaoShi());
		}
	}

}
