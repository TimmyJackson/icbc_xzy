package tiger.biz.socialnet.suport;

import tiger.core.basic.PageResult;
import tiger.core.domain.socialnet.socialnetDomain;

import java.util.List;

public interface socialnetManager {

    PageResult<List<socialnetDomain>> getSome(String column, String value);

}
