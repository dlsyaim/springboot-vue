package ks.monitor.controlller;

import com.github.pagehelper.PageHelper;
import ks.monitor.common.Assist;
import ks.monitor.entity.KsManager;
import ks.monitor.service.KsManagerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dlsyaim on 2018/3/13.
 */
@RestController
@RequestMapping("ksManager")
@Slf4j
public class KsManagerController {

    @Autowired
    private KsManagerService ksManagerService;

    /**
     * 获取用户列表
     * @param start
     * @param size
     * @return
     */
    @GetMapping(value = "list/{start}/{size}")
    public List<KsManager> getUserList(@PathVariable("start")int start, @PathVariable("size")int size){
        //PageHelper.startPage(start,size);
        //List<KsManager> list= ksManagerService.getList();

        Assist assist = new Assist();
        assist.setRequires(Assist.customRequire("ManagerID in(",")",1,2));
        List<KsManager> list = ksManagerService.selectKsManager(assist);
        return list;
    }
}
