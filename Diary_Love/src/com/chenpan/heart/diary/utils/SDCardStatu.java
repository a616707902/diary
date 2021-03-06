package com.chenpan.heart.diary.utils;

import java.io.File;

import android.os.Environment;

/**
 * @className SDCardStatu
 * @author goubaihu
 * @function SDCard状态
 * @createTime 2014年11月28号
 */
public class SDCardStatu {

	public static boolean isSDCardAvailable() {
		// 获得sd卡的状态
		String sdState = Environment.getExternalStorageState();
		// 判断SD卡是否存在
		return sdState.equals(Environment.MEDIA_MOUNTED);
	}

	/**
	 * 得到手机内存路径
	 * 
	 * @return
	 */
	public static String get_SdCard_Categories() {
		return Environment.getExternalStorageDirectory().getAbsolutePath()
				+ File.separator;
	}

	

}