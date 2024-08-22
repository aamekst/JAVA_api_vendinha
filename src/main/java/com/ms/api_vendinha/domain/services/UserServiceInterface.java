package com.ms.api_vendinha.domain.services;

import com.ms.api_vendinha.domain.dto.UserRequestDto;
import com.ms.api_vendinha.domain.dto.UserResponseDto;

public interface UserServiceInterface {
   UserResponseDto save(UserRequestDto userRequestDto);
}