package com.demoexercise.ssm4j.core.generic;

/**
 * DAO通用的顶级接口 封装基本的crud以及主键查询、删除等方法
 *
 * Entity:Model层的实体类，对应数据库中的table
 * PK:主键
 *
 * Created by Chen Zhuo on 2016/7/31.
 */
public interface GenericMapper<Entity, PK> {
  /**
   *
   * @param entity
   * @param pk
   * @return
   */
  int select(Entity entity,PK pk);

  /**
   * insert
   *
   * @param entity 实体对象
   */
  int insert(Entity entity);

  /**
   * update
   *
   * @param entity
   * @param pk
   */
  int update(Entity entity, PK pk);


  /**
   *
   * @param entity
   * @param pk
   * @return
   */
  int delete(Entity entity, PK pk);
}
