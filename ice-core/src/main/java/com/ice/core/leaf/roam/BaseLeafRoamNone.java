package com.ice.core.leaf.roam;

import com.ice.core.context.IceContext;
import com.ice.core.context.IceRoam;
import com.ice.core.leaf.base.BaseLeafNone;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.lang.reflect.InvocationTargetException;

/**
 * @author zjn
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class BaseLeafRoamNone extends BaseLeafNone {

  @Override
  protected void doNone(IceContext cxt) throws InvocationTargetException, IllegalAccessException {
    doRoamNone(cxt.getPack().getRoam());
  }

  /**
   * process leaf none with roam
   *
   * @param roam
   * @return
   */
  protected abstract void doRoamNone(IceRoam roam) throws InvocationTargetException, IllegalAccessException;
}
