package top.gabin.tools.request.ecommerce.refunds;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * <pre>
 * 退款状态改变后，微信会把相关退款结果发送给商户。
 * 文档地址:https://pay.weixin.qq.com/wiki/doc/apiv3/wxpay/ecommerce/refunds/chapter3_3.shtml
 * </pre>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RefundNotifyRequest1 {
	/**
	 * <pre>
	 * 字段名：电商平台商户号
	 * 变量名：sp_mchid
	 * 是否必填：是
	 * 类型：string(32)
	 * 描述：
	 *  微信支付分配给电商平台的商户号 
	 *  示例值：1900000100 
	 * </pre>
	 */
	@JsonProperty(value = "sp_mchid")
	private String spMchid;

	/**
	 * <pre>
	 * 字段名：二级商户号
	 * 变量名：sub_mchid
	 * 是否必填：是
	 * 类型：string(32)
	 * 描述：
	 *  微信支付分配给二级商户的商户号 
	 *  示例值：1900000109 
	 * </pre>
	 */
	@JsonProperty(value = "sub_mchid")
	private String subMchid;

	/**
	 * <pre>
	 * 字段名：商户订单号
	 * 变量名：out_trade_no
	 * 是否必填：是
	 * 类型：string(32)
	 * 描述：
	 *  返回的商户订单号 
	 *  示例值： 1217752501201407033233368018 
	 * </pre>
	 */
	@JsonProperty(value = "out_trade_no")
	private String outTradeNo;

	/**
	 * <pre>
	 * 字段名：微信订单号
	 * 变量名：transaction_id
	 * 是否必填：是
	 * 类型：string(32)
	 * 描述：
	 *  微信支付订单号 
	 *  示例值： 1217752501201407033233368018 
	 * </pre>
	 */
	@JsonProperty(value = "transaction_id")
	private String transactionId;

	/**
	 * <pre>
	 * 字段名：商户退款单号
	 * 变量名：out_refund_no
	 * 是否必填：是
	 * 类型：string(64)
	 * 描述：
	 *  商户退款单号 
	 *  示例值： 1217752501201407033233368018 
	 * </pre>
	 */
	@JsonProperty(value = "out_refund_no")
	private String outRefundNo;

	/**
	 * <pre>
	 * 字段名：微信退款单号
	 * 变量名：refund_id
	 * 是否必填：是
	 * 类型：string(32)
	 * 描述：
	 *  微信退款单号 
	 *  示例值： 1217752501201407033233368018 
	 * </pre>
	 */
	@JsonProperty(value = "refund_id")
	private String refundId;

	/**
	 * <pre>
	 * 字段名：退款状态
	 * 变量名：refund_status
	 * 是否必填：是
	 * 类型：string(16)
	 * 描述：
	 *  退款状态，枚举值： 
	 *  SUCCESS：退款成功
	 *  CLOSE：退款关闭 
	 *  ABNORMAL：退款异常，退款到银行发现用户的卡作废或者冻结了，导致原路退款银行卡失败，可前往【服务商平台—>交易中心】，手动处理此笔退款 
	 *  示例值：SUCCESS 
	 * </pre>
	 */
	@JsonProperty(value = "refund_status")
	private String refundStatus;

	/**
	 * <pre>
	 * 字段名：退款成功时间
	 * 变量名：success_time
	 * 是否必填：否
	 * 类型：string(64)
	 * 描述：
	 *  1、退款成功时间，遵循rfc3339标准格式，格式为YYYY-MM-DDTHH:mm:ss+TIMEZONE，YYYY-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日13点29分35秒。
	 *  2、当退款状态为退款成功时返回此参数。
	 *  示例值：2018-06-08T10:34:56+08:00 
	 * </pre>
	 */
	@JsonProperty(value = "success_time")
	private String successTime;

	/**
	 * <pre>
	 * 字段名：退款入账账户
	 * 变量名：user_received_account
	 * 是否必填：是
	 * 类型：string(64)
	 * 描述：
	 *  取当前退款单的退款入账方。 
	 *  退回银行卡：{银行名称}{卡类型}{卡尾号} 
	 *  退回支付用户零钱: 支付用户零钱
	 *  退还商户: 商户基本账户、商户结算银行账户
	 *  退回支付用户零钱通：支付用户零钱通 
	 *  示例值：招商银行信用卡0403 
	 * </pre>
	 */
	@JsonProperty(value = "user_received_account")
	private String userReceivedAccount;

	/**
	 * <pre>
	 * 字段名：+金额信息
	 * 变量名：amount
	 * 是否必填：是
	 * 类型：object
	 * 描述：金额信息 
	 * </pre>
	 */
	@JsonProperty(value = "amount")
	private Amount amount;

	public String getSpMchid() {
		return this.spMchid;
	}

	public void setSpMchid(String spMchid) {
		this.spMchid = spMchid;
	}

	public String getSubMchid() {
		return this.subMchid;
	}

	public void setSubMchid(String subMchid) {
		this.subMchid = subMchid;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getOutRefundNo() {
		return this.outRefundNo;
	}

	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}

	public String getRefundId() {
		return this.refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getSuccessTime() {
		return this.successTime;
	}

	public void setSuccessTime(String successTime) {
		this.successTime = successTime;
	}

	public String getUserReceivedAccount() {
		return this.userReceivedAccount;
	}

	public void setUserReceivedAccount(String userReceivedAccount) {
		this.userReceivedAccount = userReceivedAccount;
	}

	public Amount getAmount() {
		return this.amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Amount {
		/**
		 * <pre>
		 * 字段名：订单金额
		 * 变量名：total
		 * 是否必填：是
		 * 类型：int
		 * 描述：
		 *  订单总金额，单位为分，只能为整数，详见支付金额
		 *  示例值：999 
		 * </pre>
		 */
		@JsonProperty(value = "total")
		private String total;

		/**
		 * <pre>
		 * 字段名：退款金额
		 * 变量名：refund
		 * 是否必填：是
		 * 类型：int
		 * 描述：
		 *  退款金额，币种的最小单位，只能为整数，不能超过原订单支付金额，如果有使用券，后台会按比例退。 
		 *  示例值：999 
		 * </pre>
		 */
		@JsonProperty(value = "refund")
		private String refund;

		/**
		 * <pre>
		 * 字段名：用户支付金额
		 * 变量名：payer_total
		 * 是否必填：是
		 * 类型：int
		 * 描述：
		 *  用户实际支付金额，单位为分，只能为整数，详见支付金额
		 *  示例值：999 
		 * </pre>
		 */
		@JsonProperty(value = "payer_total")
		private String payerTotal;

		/**
		 * <pre>
		 * 字段名：用户退款金额
		 * 变量名：payer_refund
		 * 是否必填：是
		 * 类型：int
		 * 描述：
		 *  退款给用户的金额，不包含所有优惠券金额 
		 *  示例值：999 
		 * </pre>
		 */
		@JsonProperty(value = "payer_refund")
		private String payerRefund;

		public String getTotal() {
			return this.total;
		}

		public void setTotal(String total) {
			this.total = total;
		}

		public String getRefund() {
			return this.refund;
		}

		public void setRefund(String refund) {
			this.refund = refund;
		}

		public String getPayerTotal() {
			return this.payerTotal;
		}

		public void setPayerTotal(String payerTotal) {
			this.payerTotal = payerTotal;
		}

		public String getPayerRefund() {
			return this.payerRefund;
		}

		public void setPayerRefund(String payerRefund) {
			this.payerRefund = payerRefund;
		}

	}

}