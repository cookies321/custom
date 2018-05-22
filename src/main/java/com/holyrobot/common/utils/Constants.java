package com.holyrobot.common.utils;

import org.springframework.beans.factory.annotation.Value;

/**
 * 
 * @Description: 常量
 * @author 汤玉林
 * @date 2018年3月22日 上午9:11:59
 */
public class Constants {
	
	@Value("${userInfoURL}")
	public static String userInfoURL;
	
	@Value("${appkey}")
	public static String appkey;
	
	/**用户缓存token的键*/
	@Value("${user_token_key}")
	public static String user_token_key;
	
	/**登录验证重定向url**/
	@Value("${login_redirect_url}")
	public static String login_redirect_url;
	
	/**session过期时间*/
	@Value("${token_expire_time}")
	public static int token_expire_time;


	/** 存放Token的header字段 (@author: rico) */
	public static final String DEFAULT_TOKEN_NAME = "X-Token";

	/**
	 * ES索引字段名
	 */
	/***********product索引************/
	public static final String ES_PRODUCT_INDEX_NAME = "p_pro_product";

	public static final String ES_PRODUCT_TYPE_NAME = "p_pro_product";

	public static final String ES_PRODUCT_ID = "iD";

	public static final String ES_PRODUCT_PRO_TYPE_ID = "proTypeID";

	public static final String ES_PRODUCT_PRO_TYPE = "proType";

	public static final String ES_PRODUCT_PRO_CATEGORY_ID = "proCategoryID";

	public static final String ES_PRODUCT_PRO_CATEGORY = "proCategory";

	public static final String ES_PRODUCT_PRO_NAME = "proName";

	public static final String ES_PRODUCT_ALIASE_NAME = "aliaseName";

	public static final String ES_PRODUCT_PRO_NO = "proNo";

	public static final String ES_PRODUCT_TOUR_DAYS = "tourDays";

	public static final String ES_PRODUCT_START_DAYS = "startDate";

	public static final String ES_PRODUCT_DUE_DATE = "dueDate";

	public static final String ES_PRODUCT_DEPARTURE = "departure";

	public static final String ES_PRODUCT_DESTINATION = "destination";

	public static final String ES_PRODUCT_PRO_TAG = "proTag";

	public static final String ES_PRODUCT_FEATURE = "feature";

	public static final String ES_PRODUCT_FEE_INCLUDES = "feeIncludes";

	public static final String ES_PRODUCT_FEE_NON_INCLUDES = "feeNonIncludes";

	public static final String ES_PRODUCT_TRAVEL_NAME = "travelName";

	public static final String ES_PRODUCT_BRAND_NAME = "brandName";

	public static final String ES_PRODUCT_IS_ACK = "isAck";

	public static final String ES_PRODUCT_DATA_STATUS = "dataStatus";

	public static final String ES_PRODUCT_ORG_ID = "orgID";
	
	public static final String Es_PRODUCT_PRICE="defaultPrice";
	
	public static final String Es_PRODUCT_SITE="sites.sitename";
	
	/**********tour索引*********/
	public static final String ES_TOUR_INDEX_NAME = "p_pro_product_tour";
	
	public static final String ES_TOUR_TYPE_NAME = "p_pro_product_tour";
	
	public static final String ES_TOUR_ID = "id";
	
	public static final String ES_TOUR_PRO_ID="proid";
	
	public static final String ES_TOUR_TOUR_ID="tourid";
	
	public static final String ES_TOUR_SITE_ID="siteID";
	
	public static final String ES_TOUR_SITE_NAME="siteName";
	
	public static final String ES_TOUR_NO="tourNo";
	
	public static final String ES_TOUR_NAME="tourName";
	
	public static final String ES_TOUR_DATE="tourDate";
	
	public static final String ES_TOUR_DUE_DATE="dueDate";
	
	public static final String ES_TOUR_PLAN_NUM="planNum";
	
	public static final String ES_TOUR_MIN_NUM="minNum";
	
	public static final String ES_TOUR_SEAT_NUM="seatNum";
	
	public static final String ES_TOUR_STATUS="tourStatus";
	
	public static final String ES_TOUR_DATE_YEAR="tourDate_year";
	
	public static final String ES_TOUR_DATE_MONTH="tourDate_month";
	
	public static final String ES_TOUR_DATE_DAY="tourDate_day";
	
	public static final String ES_TOUR_DATE_HOUR="tourDate_hour";
	
	public static final String ES_TOUR_DATE_MINUTE="tourDate_minute";
	
	public static final String ES_TOUR_DATE_SECOND="tourDate_second";
	
	public static final String ES_TOUR_PRICE="price";
	
	public static final String ES_TOUR_SINGLE_ROOM_PRICE="singleroomprice";
	
	public static final String ES_TOUR_REBATE="rebate";
	
	public static final String ES_TOUR_QTY="qty";
	
	public static final String[] PRO_TYPES={"跟团游","自由行","半自由行"};

}
