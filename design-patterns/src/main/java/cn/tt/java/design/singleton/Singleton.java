package cn.tt.java.design.singleton;

import cn.tt.java.design.utils.Logger;

/**
 * 
 * @title 单例模式实例
 * @copyright Copyright (c) 2016
 * @company
 *
 * @author JeremyTang
 * @version 1.3.0
 * @date 2016年3月29日
 */
public class Singleton {

	private static Singleton mInstance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (mInstance == null) {
			mInstance = new Singleton();
		}
		return mInstance;
	}

	public void testSingleton() {
		Logger.debug("Singleton");
	}

}
