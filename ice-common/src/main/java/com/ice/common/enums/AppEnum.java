package com.ice.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zjn
 * 业务App
 */
public enum AppEnum {
  /**
   * 测试项目
   */
  TEST(1, "Test");

  private static final Map<Integer, AppEnum> MAP = new HashMap<>();

  static {
    for (AppEnum enums : AppEnum.values()) {
      MAP.put(enums.getApp(), enums);
    }
  }

  private final int app;
  private final String name;

  AppEnum(int app, String name) {
    this.app = app;
    this.name = name;
  }

  public static Map<Integer, AppEnum> getMAP() {
    return MAP;
  }

  public static AppEnum getEnum(int app) {
    return MAP.get(app);
  }

  public int getApp() {
    return app;
  }

  public String getName() {
    return name;
  }
}
