package com.demoexercise.ssm4j.core.generic;

import java.util.List;

/**
 * Created by Chen Zhuo on 2016/8/9.
 */
public abstract class GenericServiceInstance<Entity, PK> implements GenericService<Entity, PK> {

  public abstract GenericMapper<Entity, PK> getDao();

  /**
   * 插入对象
   *
   * @param entity 对象
   */
  public int insert(Entity entity) {
    return getDao().insert(entity);
  }

  /**
   * 更新对象
   *
   * @param entity 对象
   */
  public int update(Entity entity,PK pk) {
    return getDao().update(entity, pk);
  }

  /**
   * 通过主键, 删除对象
   *
   * @param id 主键
   */
  public int delete(Entity entity,PK id) {
    return getDao().delete(entity,id);
  }

  /**
   * 通过主键, 查询对象
   *
   * @param id 主键
   * @return
   */
  public int selectById(Entity entity, PK id) {
    return getDao().select(entity,id);
  }


}
