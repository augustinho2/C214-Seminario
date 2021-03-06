# C214-Seminario

- [Sobre](#-sobre)
- [Como executar](#-como-executar)
- [Estrutura de arquivos](#-estrutura-de-arquivos)
- [Tecnologias](#-tecnologias)


## π» Sobre

Este Γ© o nosso seminΓ‘rio de Engenharia de software (C214).  

<br/>

---

## π Como executar

### PrΓ©-requisitos

Antes de comeΓ§ar, vocΓͺ vai precisar ter instalado em sua mΓ‘quina as seguintes ferramentas:

- [Git](https://git-scm.com/)
- [Visual Studio Code](https://code.visualstudio.com/)
- [Java](https://www.java.com)
- [Selenium](https://www.selenium.dev)


### Clonando repositΓ³rio

Para clonar o repositΓ³rio em algum lugar na sua mΓ‘quina, basta utilizar o comando abaixo:
```bash
$ git clone https://github.com/augustinho2/C214-Seminario.git
```

### Instalando dependΓͺncias da aplicaΓ§Γ£o

## π Estrutura de arquivos

```
C214-Seminario
ββ .factorypath
ββ .git
β  ββ COMMIT_EDITMSG
β  ββ config
β  ββ description
β  ββ FETCH_HEAD
β  ββ HEAD
β  ββ hooks
β  β  ββ applypatch-msg.sample
β  β  ββ commit-msg.sample
β  β  ββ fsmonitor-watchman.sample
β  β  ββ post-update.sample
β  β  ββ pre-applypatch.sample
β  β  ββ pre-commit.sample
β  β  ββ pre-merge-commit.sample
β  β  ββ pre-push.sample
β  β  ββ pre-rebase.sample
β  β  ββ pre-receive.sample
β  β  ββ prepare-commit-msg.sample
β  β  ββ push-to-checkout.sample
β  β  ββ update.sample
β  ββ index
β  ββ info
β  β  ββ exclude
β  ββ logs
β  β  ββ HEAD
β  β  ββ refs
β  β     ββ heads
β  β     β  ββ develop
β  β     β  ββ main
β  β     ββ remotes
β  β        ββ origin
β  β           ββ develop
β  β           ββ HEAD
β  β           ββ main
β  ββ objects
β  β  ββ 1b
β  β  β  ββ aa80d3d2985d19aa11897256aabd8c59570c49
β  β  ββ 30
β  β  β  ββ 08e6fdb82b044e29a4eef70c651002777bae12
β  β  ββ 3e
β  β  β  ββ 8b8e4d80b9a30605b04350134d5b1e04d1dbd0
β  β  ββ 5f
β  β  β  ββ 602d61e385f8d84f11727346f135f54f5b7b58
β  β  ββ 85
β  β  β  ββ 4920d1d2500c028cae617224f3fc4595d3553d
β  β  ββ ea
β  β  β  ββ e4288050db60822ebe971c25eddd974f34cff0
β  β  ββ info
β  β  ββ pack
β  β     ββ pack-af729fc11f1493dadcc0190ff94ee7e799c8ebbd.idx
β  β     ββ pack-af729fc11f1493dadcc0190ff94ee7e799c8ebbd.pack
β  ββ ORIG_HEAD
β  ββ packed-refs
β  ββ refs
β     ββ heads
β     β  ββ develop
β     β  ββ main
β     ββ remotes
β     β  ββ origin
β     β     ββ develop
β     β     ββ HEAD
β     β     ββ main
β     ββ tags
ββ .gitignore
ββ .idea
β  ββ .gitignore
β  ββ compiler.xml
β  ββ encodings.xml
β  ββ jarRepositories.xml
β  ββ libraries
β  β  ββ Maven__com_beust_jcommander_1_81.xml
β  β  ββ Maven__com_google_auto_auto_common_1_0.xml
β  β  ββ Maven__com_google_auto_service_auto_service_1_0.xml
β  β  ββ Maven__com_google_auto_service_auto_service_annotations_1_0.xml
β  β  ββ Maven__com_google_code_findbugs_jsr305_3_0_2.xml
β  β  ββ Maven__com_google_errorprone_error_prone_annotations_2_7_1.xml
β  β  ββ Maven__com_google_guava_failureaccess_1_0_1.xml
β  β  ββ Maven__com_google_guava_guava_31_0_1_jre.xml
β  β  ββ Maven__com_google_guava_listenablefuture_9999_0_empty_to_avoid_conflict_with_guava.xml
β  β  ββ Maven__com_google_j2objc_j2objc_annotations_1_3.xml
β  β  ββ Maven__com_sun_activation_jakarta_activation_1_2_2.xml
β  β  ββ Maven__com_typesafe_netty_netty_reactive_streams_2_0_4.xml
β  β  ββ Maven__io_netty_netty_buffer_4_1_68_Final.xml
β  β  ββ Maven__io_netty_netty_codec_4_1_67_Final.xml
β  β  ββ Maven__io_netty_netty_codec_http_4_1_67_Final.xml
β  β  ββ Maven__io_netty_netty_codec_socks_4_1_60_Final.xml
β  β  ββ Maven__io_netty_netty_common_4_1_68_Final.xml
β  β  ββ Maven__io_netty_netty_handler_4_1_67_Final.xml
β  β  ββ Maven__io_netty_netty_handler_proxy_4_1_60_Final.xml
β  β  ββ Maven__io_netty_netty_resolver_4_1_68_Final.xml
β  β  ββ Maven__io_netty_netty_transport_4_1_68_Final.xml
β  β  ββ Maven__io_netty_netty_transport_native_epoll_4_1_67_Final.xml
β  β  ββ Maven__io_netty_netty_transport_native_epoll_linux_x86_64_4_1_60_Final.xml
β  β  ββ Maven__io_netty_netty_transport_native_kqueue_4_1_67_Final.xml
β  β  ββ Maven__io_netty_netty_transport_native_kqueue_osx_x86_64_4_1_60_Final.xml
β  β  ββ Maven__io_netty_netty_transport_native_unix_common_4_1_67_Final.xml
β  β  ββ Maven__io_opentelemetry_opentelemetry_api_1_6_0.xml
β  β  ββ Maven__io_opentelemetry_opentelemetry_api_metrics_1_6_0_alpha.xml
β  β  ββ Maven__io_opentelemetry_opentelemetry_context_1_6_0.xml
β  β  ββ Maven__io_opentelemetry_opentelemetry_exporter_logging_1_6_0.xml
β  β  ββ Maven__io_opentelemetry_opentelemetry_sdk_1_6_0.xml
β  β  ββ Maven__io_opentelemetry_opentelemetry_sdk_common_1_6_0.xml
β  β  ββ Maven__io_opentelemetry_opentelemetry_sdk_extension_autoconfigure_1_6_0_alpha.xml
β  β  ββ Maven__io_opentelemetry_opentelemetry_sdk_extension_autoconfigure_spi_1_6_0.xml
β  β  ββ Maven__io_opentelemetry_opentelemetry_sdk_metrics_1_6_0_alpha.xml
β  β  ββ Maven__io_opentelemetry_opentelemetry_sdk_trace_1_6_0.xml
β  β  ββ Maven__io_opentelemetry_opentelemetry_semconv_1_6_0_alpha.xml
β  β  ββ Maven__io_ous_jtoml_2_0_0.xml
β  β  ββ Maven__junit_junit_4_11.xml
β  β  ββ Maven__net_bytebuddy_byte_buddy_1_11_19.xml
β  β  ββ Maven__org_apache_commons_commons_exec_1_3.xml
β  β  ββ Maven__org_asynchttpclient_async_http_client_2_12_3.xml
β  β  ββ Maven__org_asynchttpclient_async_http_client_netty_utils_2_12_3.xml
β  β  ββ Maven__org_checkerframework_checker_qual_3_12_0.xml
β  β  ββ Maven__org_hamcrest_hamcrest_core_1_3.xml
β  β  ββ Maven__org_reactivestreams_reactive_streams_1_0_3.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_api_4_0_0.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_chrome_driver_4_0_0.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_chromium_driver_4_0_0.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_devtools_v85_4_0_0.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_devtools_v93_4_0_0.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_devtools_v94_4_0_0.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_devtools_v95_4_0_0.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_edge_driver_4_0_0.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_firefox_driver_4_0_0.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_firefox_xpi_driver_4_0_0.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_http_4_0_0.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_ie_driver_4_0_0.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_java_4_0_0.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_json_4_0_0.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_opera_driver_4_0_0.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_remote_driver_4_0_0.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_safari_driver_4_0_0.xml
β  β  ββ Maven__org_seleniumhq_selenium_selenium_support_4_0_0.xml
β  β  ββ Maven__org_slf4j_slf4j_api_1_7_30.xml
β  ββ misc.xml
β  ββ modules.xml
β  ββ runConfigurations.xml
β  ββ uiDesigner.xml
β  ββ vcs.xml
β  ββ workspace.xml
ββ .project
ββ .settings
β  ββ org.eclipse.core.resources.prefs
β  ββ org.eclipse.jdt.apt.core.prefs
β  ββ org.eclipse.jdt.core.prefs
β  ββ org.eclipse.m2e.core.prefs
ββ demo.iml
ββ LICENSE
ββ pom.xml
ββ README.md
ββ src
β  ββ drive
β  β  ββ chromedriver.exe
β  β  ββ msedgedriver.exe
β  ββ test
β     ββ java
β        ββ br
β           ββ inatel
β              ββ test
β                 ββ ChromeTest.java
β                 ββ EdgeTest.java
ββ target
   ββ test-classes
      ββ br
         ββ inatel
            ββ test

```



## π  Tecnologias

### Ferramentas e ServiΓ§os
- [Git](https://git-scm.com/)


### DependΓͺncias de desenvolvimento
- [Maven](https://maven.apache.org)
- [Selenium Web Driver](https://www.selenium.dev/documentation/webdriver/)
- [ChromeDriver](https://chromedriver.chromium.org/downloads)
- [MsDriver](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/)
