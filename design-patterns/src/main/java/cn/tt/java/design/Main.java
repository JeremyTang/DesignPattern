package cn.tt.java.design;

import cn.tt.java.design.singleton.Singleton;

/**
 * 
 * @title 设计模式测试类
 * @copyright Copyright (c) 2016
 * @company
 *
 * @author JeremyTang
 * @version 1.3.0
 * @date 2016年3月29日
 */
public class Main {

	public static void main(String[] args) {
		// 单例模式
		Singleton instance = Singleton.getInstance();
		instance.testSingleton();
	}

}
