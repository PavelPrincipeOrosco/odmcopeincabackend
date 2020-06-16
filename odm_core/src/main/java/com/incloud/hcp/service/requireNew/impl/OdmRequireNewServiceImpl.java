/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/dto/EntityrequirenewDTOService.java.e.vm
 */
package com.incloud.hcp.service.requireNew.impl;

import com.incloud.hcp.domain.Odm;
import com.incloud.hcp.service._framework.impl.JPACustomRequiredNewServiceImpl;
import com.incloud.hcp.service.requireNew.OdmRequireNewService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
public class OdmRequireNewServiceImpl extends JPACustomRequiredNewServiceImpl<Odm, Long> implements OdmRequireNewService {

}
