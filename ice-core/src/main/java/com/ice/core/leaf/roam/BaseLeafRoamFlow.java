package com.ice.core.leaf.roam;

import com.ice.core.context.IceContext;
import com.ice.core.context.IceRoam;
import com.ice.core.leaf.base.BaseLeafFlow;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.lang.reflect.InvocationTargetException;

/**
 * @author zjn
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class BaseLeafRoamFlow extends BaseLeafFlow {

  @Override
  protected boolean doFlow(IceContext cxt) throws InvocationTargetException, IllegalAccessException {
    return doRoamFlow(cxt.getPack().getRoam());
  }

  /**
   * process leaf flow with roam
   *
   * @param roam
   * @return
   */
  protected abstract boolean doRoamFlow(IceRoam roam) throws InvocationTargetException, IllegalAccessException;
}
