package com.snax.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description: 描述
 * <br>
 * @date: 2020/5/22 15:15
 * @author: snax
 * @version: SmartCityManager V1.0
 * @since: JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment  implements Serializable {
    private Long id;
    private String serial;
}
