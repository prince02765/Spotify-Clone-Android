package com.example.spotifyclone.di;

import android.content.Context;
import com.bumptech.glide.RequestManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideGlideInstanceFactory implements Factory<RequestManager> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideGlideInstanceFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public RequestManager get() {
    return provideGlideInstance(contextProvider.get());
  }

  public static AppModule_ProvideGlideInstanceFactory create(Provider<Context> contextProvider) {
    return new AppModule_ProvideGlideInstanceFactory(contextProvider);
  }

  public static RequestManager provideGlideInstance(Context context) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideGlideInstance(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
