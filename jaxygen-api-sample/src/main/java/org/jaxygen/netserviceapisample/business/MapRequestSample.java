/*
 * Copyright 2016 Jakub Knast.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jaxygen.netserviceapisample.business;

import org.jaxygen.netserviceapisample.business.dto.maps.HashMapRequestDTO;
import org.jaxygen.netserviceapisample.business.dto.maps.HashMapResponseDTO;
import org.jaxygen.netserviceapisample.business.dto.lists.GenericArrayListResponseDTO;
import org.jaxygen.annotations.NetAPI;
import org.jaxygen.annotations.Status;
import org.jaxygen.util.BeanUtil;

/**
 *
 * @author jknast
 */
public class MapRequestSample {

  @NetAPI(description = "",
          status = Status.GenerallyAvailable,
          version = "1.0.6"
  )
  public HashMapResponseDTO simpeHashmapRequest(HashMapRequestDTO request) {
    HashMapResponseDTO responseDTO = new HashMapResponseDTO();
    BeanUtil.translateBean(request, responseDTO);
    return responseDTO;
  }
}
