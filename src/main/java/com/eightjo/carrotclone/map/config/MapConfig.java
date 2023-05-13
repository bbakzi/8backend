package com.eightjo.carrotclone.map.config;

import org.springframework.beans.factory.annotation.Value;

public class MapConfig {

    @Value("${CHAT-GPT-KEY}")
    private static String apiKey;

    public static String MODEL = "gpt-3.5-turbo";

    public static final String CHAT_MODEL = "gpt-3.5-turbo";
    public static final String TEXT_MODEL = "text-davinci-003";

    public static final String AUTHORIZATION = "Authorization";
    public static final String BEARER = "Bearer ";
    public static final Integer MAX_TOKEN = 300;
    public static final Double TEMPERATURE = 0.0;
    public static final Double TOP_P = 1.0;
    public static final String MEDIA_TYPE = "application/json; charset=UTF-8";
    public static final String CHAT_URL = "https://api.openai.com/v1/chat/completions";
    public static final String TEXT_URL = "https://api.openai.com/v1/completions";
    public static final String MODEL_INFO_URL = "https://api.openai.com/v1/models/";

    public String getApiKey() {
        return apiKey;
    }
}
