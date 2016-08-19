package com.demoexercise.ssm4j.core.generic;

/**
 *
 * 顶级Service接口 包含基本的select insert delete update方法
 * Created by Chen Zhuo on 2016/8/8.
 */
public interface GenericService<Entity, PK> {
  /**
   * select
   * @param pk
   * @return
   */
  Entity selectedById(PK pk);

  /**
   * insert
   * @param entity
   * @return
   */
  int insert(Entity entity);


  /**
   * update
   * @param entity
   * @param pk
   * @return
   */
  int update(Entity entity, PK pk);


  /**
   * delete
   * @param pk
   * @return
   */
  int delete(PK pk);
}
