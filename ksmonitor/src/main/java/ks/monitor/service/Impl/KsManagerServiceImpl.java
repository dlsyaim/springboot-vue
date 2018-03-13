package ks.monitor.service.Impl;
import java.util.List;
import ks.monitor.dao.KsManagerDao;
import ks.monitor.entity.KsManager;
import ks.monitor.common.Assist;
import ks.monitor.service.KsManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class KsManagerServiceImpl implements KsManagerService{
    @Autowired
    private KsManagerDao ksManagerDao;
    @Override
    public long getKsManagerRowCount(Assist assist){
        return ksManagerDao.getKsManagerRowCount(assist);
    }
    @Override
    public List<KsManager> selectKsManager(Assist assist){
        return ksManagerDao.selectKsManager(assist);
    }
    @Override
    public KsManager selectKsManagerByObj(KsManager obj){
        return ksManagerDao.selectKsManagerByObj(obj);
    }
    @Override
    public KsManager selectKsManagerById(Object id){
        return ksManagerDao.selectKsManagerById(id);
    }
    @Override
    public int insertKsManager(KsManager value){
        return ksManagerDao.insertKsManager(value);
    }
    @Override
    public int insertNonEmptyKsManager(KsManager value){
        return ksManagerDao.insertNonEmptyKsManager(value);
    }
    @Override
    public int insertKsManagerByBatch(List<KsManager> value){
        return ksManagerDao.insertKsManagerByBatch(value);
    }
    @Override
    public int deleteKsManagerById(Object id){
        return ksManagerDao.deleteKsManagerById(id);
    }
    @Override
    public int deleteKsManager(Assist assist){
        return ksManagerDao.deleteKsManager(assist);
    }
    @Override
    public int updateKsManagerById(KsManager enti){
        return ksManagerDao.updateKsManagerById(enti);
    }
    @Override
    public int updateKsManager(KsManager value, Assist assist){
        return ksManagerDao.updateKsManager(value,assist);
    }
    @Override
    public int updateNonEmptyKsManagerById(KsManager enti){
        return ksManagerDao.updateNonEmptyKsManagerById(enti);
    }
    @Override
    public int updateNonEmptyKsManager(KsManager value, Assist assist){
        return ksManagerDao.updateNonEmptyKsManager(value,assist);
    }

    public KsManagerDao getKsManagerDao() {
        return this.ksManagerDao;
    }

    public void setKsManagerDao(KsManagerDao ksManagerDao) {
        this.ksManagerDao = ksManagerDao;
    }

    /**
     * 获取用户列表
     * @return
     */
    @Override
    public List<KsManager> getList() {
        return ksManagerDao.queryList();
    }

}