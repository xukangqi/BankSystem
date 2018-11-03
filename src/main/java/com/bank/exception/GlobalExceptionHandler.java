package com.bank.exception;

import com.bank.utils.BankResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@EnableWebMvc
@ControllerAdvice
public class GlobalExceptionHandler {
	public static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	/**
	 * 处理所有业务异常
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(value = BizException.class)
	@ResponseBody
	public BankResult handleBusinessException(BizException ex) {
/*		LogUtil.error(ErrorLoggers.ERROR_LOGGER, ex.getMessage(), ex);
		RequestResultVO requestResultVO = new RequestResultVO();
		requestResultVO.setCode(ex.getCode());
		requestResultVO.setMessage(ex.getMessage());
		return requestResultVO;*/
		return BankResult.build(400, ex.getMessage());
	}

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public BankResult defaultErrorHandler(Exception e, HttpServletRequest request) {
	//	Map<String, Object> map= new HashMap<>();
		e.printStackTrace();
	//	map.put("success", Boolean.FALSE);
	//	map.put("message", "服务器报错");

	//	this.writeLog(request, e);
		
		return BankResult.build(400, "服务器报错");
	}

	private void writeLog(HttpServletRequest request, Throwable e) {
		Map<String, String> map = new HashMap<String, String>();
		Enumeration<String> enumeration = request.getHeaderNames();
		while (enumeration.hasMoreElements()) {
			String str = enumeration.nextElement().toString();
			map.put(str, request.getHeader(str));
		}
		map.put("getRequestURI", request.getRequestURI());
		logger.error("请求异常,请求头：{};", map.toString(), e);

	}
}