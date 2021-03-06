package top.gabin.tools.request.ecommerce.refunds;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * <pre>
 * 提交退款申请后，通过调用该接口查询退款状态。退款有一定延时，用零钱支付的退款20分钟内到账，银行卡支付的退款3个工作日后重新查询退款状态。
 * 文档地址:https://pay.weixin.qq.com/wiki/doc/apiv3/wxpay/ecommerce/refunds/chapter3_2.shtml
 * </pre>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RefundQueryStatusRequest {
	/**
	 * <pre>
	 * 字段名：微信退款单号
	 * 变量名：refund_id
	 * 是否必填：是
	 * 类型：string(32)
	 * 描述：
	 *  path 退款单的主键，唯一定义此资源的标识。 
	 *  示例值： 50000000382019052709732678859 
	 * </pre>
	 */
	@JsonProperty(value = "refund_id")
	private String refundId;

	/**
	 * <pre>
	 * 字段名：二级商户号
	 * 变量名：sub_mchid
	 * 是否必填：是
	 * 类型：string(32)
	 * 描述：
	 *  path 微信支付分配给二级商户的商户号。 
	 *  示例值：1900000109 
	 * </pre>
	 */
	@JsonProperty(value = "sub_mchid")
	private String subMchid;

	public String getRefundId() {
		return this.refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public String getSubMchid() {
		return this.subMchid;
	}

	public void setSubMchid(String subMchid) {
		this.subMchid = subMchid;
	}

}