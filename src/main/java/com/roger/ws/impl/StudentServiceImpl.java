package com.roger.ws.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.roger.model.Student;
import com.roger.ws.StudentService;

/**
 * <wsdl:service name="StudentServiceImplService">
		<wsdl:port binding="tns:StudentServiceImplServiceSoapBinding" name="StudentServiceImplPort">
			<soap:address location="http://localhost:8080/wsserver/services/studentOperation"/>
		</wsdl:port>
	</wsdl:service>
 */
/**
 * <wsdl:service name="studentOperation">
		<wsdl:port binding="tns:studentOperationSoapBinding" name="studentOperationPort">
			<soap:address location="http://localhost:8080/wsserver/services/studentOperation"/>
		</wsdl:port>
	</wsdl:service>
 */
@WebService(
		name = "studentWebService",
		serviceName = "studentOperation",
		portName = "studentOperationPort",
		targetNamespace = "cxf.wsimport.extrenal.roger.com"
)
public class StudentServiceImpl implements StudentService{

	private List<Student> studentList = new ArrayList<>();
	
	@WebMethod(operationName = "add")
	@Override
	public void save(@WebParam(name = "student") Student student) {
		studentList.add(student);
	}
	
	@WebMethod(operationName = "query")
	@Override
	public @WebResult(name = "student") List<Student> findAll() {
		return studentList;
	}

}
