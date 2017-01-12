package tiger.web.api.controller.socialnet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.socialnet.suport.socialnetManager;
import tiger.core.basic.PageResult;
import tiger.core.domain.socialnet.socialnetDomain;
import tiger.web.api.constants.APIConstants;
import tiger.web.api.controller.BaseController;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping(APIConstants.BASE_API_URL + "/socialnet")
public class socialnetController extends BaseController {

    @Autowired
    socialnetManager sManager;

    /**
     * 获取所有的设备信息
     *
     * @return
     */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public PageResult<List<socialnetDomain>> getSome() {

        return sManager.getSome("39","788");
    }
}
