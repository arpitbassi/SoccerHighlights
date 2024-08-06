package com.dirzaaulia.footballclips.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/dirzaaulia/footballclips/network/ScoreBatService;", "", "getClips", "Lretrofit2/Response;", "Lcom/dirzaaulia/footballclips/data/response/ClipsResponse;", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface ScoreBatService {
    @org.jetbrains.annotations.NotNull
    public static final com.dirzaaulia.footballclips.network.ScoreBatService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "video-api/v3/feed")
    public abstract java.lang.Object getClips(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dirzaaulia.footballclips.data.response.ClipsResponse>> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/dirzaaulia/footballclips/network/ScoreBatService$Companion;", "", "()V", "create", "Lcom/dirzaaulia/footballclips/network/ScoreBatService;", "client", "Lokhttp3/OkHttpClient;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.dirzaaulia.footballclips.network.ScoreBatService create(@org.jetbrains.annotations.NotNull
        okhttp3.OkHttpClient client) {
            return null;
        }
    }
}