package com.ice.core.leaf.roam;

import com.ice.core.context.IceContext;
import com.ice.core.context.IceRoam;
import com.ice.core.leaf.base.BaseLeafResult;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.lang.reflect.InvocationTargetException;

/**
 * @author zjn
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class BaseLeafRoamResult extends BaseLeafResult {

  @Override
  protected boolean doResult(IceContext cxt) throws InvocationTargetException, IllegalAccessException {
    return doRoamResult(cxt.getPack().getRoam());
  }

  /**
   * process leaf result with roam
   *
   * @param roam
   * @return
   */
  protected abstract boolean doRoamResult(IceRoam roam) throws InvocationTargetException, IllegalAccessException;
}
