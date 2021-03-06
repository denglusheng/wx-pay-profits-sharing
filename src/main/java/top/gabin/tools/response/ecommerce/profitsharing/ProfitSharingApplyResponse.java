package top.gabin.tools.response.ecommerce.profitsharing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import top.gabin.tools.response.AbstractResponse;


/**
 * <pre>
 * 微信订单支付成功后，由电商平台发起分账请求，将结算后的资金分给分账接收方。
 * 文档地址:https://pay.weixin.qq.com/wiki/doc/apiv3/wxpay/ecommerce/profitsharing/chapter3_1.shtml
 * 状态码	错误码	描述	解决方案
 * 500	SYSTEM_ERROR	系统错误	系统异常，请使用相同参数稍后重新调用
 * 400	PARAM_ERROR	参数错误	请使用正确的参数重新调用
 * 400	INVALID_REQUEST	参数错误	请使用正确的参数重新调用
 * 分账金额超限	分账金额不能大于可分金额或大于最大分账比例金额，请调整分账金额		
 * 分账接收方非法	分账接收方在分账之前需要进行添加		
 * 请求参数不符合参数格式	请求参数错误，检查原交易号是否存在或发起支付交易接口返回失败		
 * 订单处理中，暂时无法分账	订单处理中，暂时无法分账，请稍后再试		
 * 不是分账订单，无法分账	发起支付交易接口时请用分账的合适参数		
 * 429	FREQUENCY_LIMITED	频率限制	请降低频率后重试
 * 403	NO_AUTH	未开通分账权限	请开通商户号分账权限
 * </pre>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfitSharingApplyResponse extends AbstractResponse {
	/**
	 * <pre>
	 * 字段名：二级商户号
	 * 变量名：sub_mchid
	 * 是否必填：是
	 * 类型：string(32)
	 * 描述：
	 *  分账出资的电商平台二级商户，填写微信支付分配的商户号。 
	 *  示例值：1900000109 
	 * </pre>
	 */
	@JsonProperty(value = "sub_mchid")
	private String subMchid;

	/**
	 * <pre>
	 * 字段名：微信订单号
	 * 变量名：transaction_id
	 * 是否必填：是
	 * 类型：string(32)
	 * 描述：
	 *  微信支付订单号。 
	 *  示例值： 4208450740201411110007820472 
	 * </pre>
	 */
	@JsonProperty(value = "transaction_id")
	private String transactionId;

	/**
	 * <pre>
	 * 字段名：商户分账单号
	 * 变量名：out_order_no
	 * 是否必填：是
	 * 类型：string(64)
	 * 描述：
	 *  商户系统内部的分账单号，在商户系统内部唯一（单次分账、多次分账、完结分账应使用不同的商户分账单号），同一分账单号多次请求等同一次。 
	 *  示例值：P20150806125346 
	 * </pre>
	 */
	@JsonProperty(value = "out_order_no")
	private String outOrderNo;

	/**
	 * <pre>
	 * 字段名：微信分账单号
	 * 变量名：order_id
	 * 是否必填：是
	 * 类型：string(64)
	 * 描述：
	 *  微信分账单号，微信系统返回的唯一标识。 
	 *  示例值： 6754760740201411110007865434 
	 * </pre>
	 */
	@JsonProperty(value = "order_id")
	private String orderId;

	public String getSubMchid() {
		return this.subMchid;
	}

	public void setSubMchid(String subMchid) {
		this.subMchid = subMchid;
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}