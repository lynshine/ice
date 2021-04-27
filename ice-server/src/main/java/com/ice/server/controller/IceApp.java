package com.ice.server.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zjn
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IceApp {
  private Integer app;
  private String appName;
}
