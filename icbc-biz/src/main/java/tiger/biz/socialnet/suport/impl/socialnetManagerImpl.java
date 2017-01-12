package tiger.biz.socialnet.suport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.biz.materials.support.MaterialsManager;
import tiger.biz.socialnet.suport.socialnetManager;
import tiger.common.dal.persistence.socialnet.Socialnet;
import tiger.core.basic.PageResult;
import tiger.core.domain.materials.MaterialsDomain;
import tiger.core.domain.socialnet.socialnetDomain;
import tiger.core.domain.socialnet.convert.socialnetConvert;
import tiger.core.service.materials.MaterialsService;
import tiger.core.service.socialnet.socialnetService;

import java.util.List;

@Service
public class socialnetManagerImpl implements socialnetManager {
    @Autowired
    socialnetService sService;

    @Override
    public PageResult<List<socialnetDomain>> getSome(String column, String value) {
        return new PageResult<>(sService.getSome(column, value));
    }

}
