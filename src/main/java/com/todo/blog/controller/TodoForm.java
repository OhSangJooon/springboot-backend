package com.todo.blog.controller;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class TodoForm {

    /**
     * TodoForm 은 Request(요청)시에 전달받은 파라미터를 관리하는 클래스입니다.
       따로 Model에 있는 파일과 구분한 이유는 추후 API 스펙이 변경될 시 해당 파일만 변경하고, Model은 그대로 사용이 가능하여 유지보수 측면에서 좋기 때문임
     * */

    @NotEmpty(message = "내용은 필수입니다.")
    private String item;

    private String date;

    private boolean completed;

    private String time;
}
