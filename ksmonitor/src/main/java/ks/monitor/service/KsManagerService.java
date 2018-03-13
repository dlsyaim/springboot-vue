package ks.monitor.service;
import java.util.List;
import ks.monitor.entity.KsManager;
import ks.monitor.common.Assist;
public interface KsManagerService{
	/**
	 * 获得KsManager数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getKsManagerRowCount(Assist assist);
	/**
	 * 获得KsManager数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<KsManager> selectKsManager(Assist assist);
	/**
	 * 获得一个KsManager对象,以参数KsManager对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    KsManager selectKsManagerByObj(KsManager obj);
	/**
	 * 通过KsManager的id获得KsManager对象
	 * @param id
	 * @return
	 */
    KsManager selectKsManagerById(Object id);
	/**
	 * 插入KsManager到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertKsManager(KsManager value);
	/**
	 * 插入KsManager中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyKsManager(KsManager value);
	/**
	 * 批量插入KsManager到数据库
	 * @param value
	 * @return
	 */
    int insertKsManagerByBatch(List<KsManager> value);
	/**
	 * 通过KsManager的id删除KsManager
	 * @param id
	 * @return
	 */
    int deleteKsManagerById(Object id);
	/**
	 * 通过辅助工具Assist的条件删除KsManager
	 * @param assist
	 * @return
	 */
    int deleteKsManager(Assist assist);
	/**
	 * 通过KsManager的id更新KsManager中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateKsManagerById(KsManager enti);
 	/**
	 * 通过辅助工具Assist的条件更新KsManager中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateKsManager(KsManager value,  Assist assist);
	/**
	 * 通过KsManager的id更新KsManager中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyKsManagerById(KsManager enti);
 	/**
	 * 通过辅助工具Assist的条件更新KsManager中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyKsManager(KsManager value, Assist assist);

	List<KsManager> getList();
}