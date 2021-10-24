# C214-Seminario

- [Sobre](#-sobre)
- [Como executar](#-como-executar)
- [Estrutura de arquivos](#-estrutura-de-arquivos)
- [Tecnologias](#-tecnologias)


## 💻 Sobre

Este é o nosso seminário de Engenharia de software (C214).  

Versão em Desenvolvimento <br/>

---

## 🚀 Como executar

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:

- [Git](https://git-scm.com/)
- [Visual Studio Code](https://code.visualstudio.com/)
- [Java](https://www.java.com)
- [Selenium](https://www.selenium.dev)


### Clonando repositório

Para clonar o repositório em algum lugar na sua máquina, basta utilizar o comando abaixo:
```bash
$ git clone https://github.com/augustinho2/C214-Seminario.git
```

### Instalando dependências da aplicação

## 📁 Estrutura de arquivos

```
C214-Seminario
├─ .factorypath
├─ .git
│  ├─ COMMIT_EDITMSG
│  ├─ config
│  ├─ description
│  ├─ FETCH_HEAD
│  ├─ HEAD
│  ├─ hooks
│  │  ├─ applypatch-msg.sample
│  │  ├─ commit-msg.sample
│  │  ├─ fsmonitor-watchman.sample
│  │  ├─ post-update.sample
│  │  ├─ pre-applypatch.sample
│  │  ├─ pre-commit.sample
│  │  ├─ pre-merge-commit.sample
│  │  ├─ pre-push.sample
│  │  ├─ pre-rebase.sample
│  │  ├─ pre-receive.sample
│  │  ├─ prepare-commit-msg.sample
│  │  ├─ push-to-checkout.sample
│  │  └─ update.sample
│  ├─ index
│  ├─ info
│  │  └─ exclude
│  ├─ logs
│  │  ├─ HEAD
│  │  └─ refs
│  │     ├─ heads
│  │     │  ├─ develop
│  │     │  └─ main
│  │     └─ remotes
│  │        └─ origin
│  │           ├─ develop
│  │           ├─ HEAD
│  │           └─ main
│  ├─ objects
│  │  ├─ 1b
│  │  │  └─ aa80d3d2985d19aa11897256aabd8c59570c49
│  │  ├─ 30
│  │  │  └─ 08e6fdb82b044e29a4eef70c651002777bae12
│  │  ├─ 3e
│  │  │  └─ 8b8e4d80b9a30605b04350134d5b1e04d1dbd0
│  │  ├─ 5f
│  │  │  └─ 602d61e385f8d84f11727346f135f54f5b7b58
│  │  ├─ 85
│  │  │  └─ 4920d1d2500c028cae617224f3fc4595d3553d
│  │  ├─ ea
│  │  │  └─ e4288050db60822ebe971c25eddd974f34cff0
│  │  ├─ info
│  │  └─ pack
│  │     ├─ pack-af729fc11f1493dadcc0190ff94ee7e799c8ebbd.idx
│  │     └─ pack-af729fc11f1493dadcc0190ff94ee7e799c8ebbd.pack
│  ├─ ORIG_HEAD
│  ├─ packed-refs
│  └─ refs
│     ├─ heads
│     │  ├─ develop
│     │  └─ main
│     ├─ remotes
│     │  └─ origin
│     │     ├─ develop
│     │     ├─ HEAD
│     │     └─ main
│     └─ tags
├─ .gitignore
├─ .idea
│  ├─ .gitignore
│  ├─ compiler.xml
│  ├─ encodings.xml
│  ├─ jarRepositories.xml
│  ├─ libraries
│  │  ├─ Maven__com_beust_jcommander_1_81.xml
│  │  ├─ Maven__com_google_auto_auto_common_1_0.xml
│  │  ├─ Maven__com_google_auto_service_auto_service_1_0.xml
│  │  ├─ Maven__com_google_auto_service_auto_service_annotations_1_0.xml
│  │  ├─ Maven__com_google_code_findbugs_jsr305_3_0_2.xml
│  │  ├─ Maven__com_google_errorprone_error_prone_annotations_2_7_1.xml
│  │  ├─ Maven__com_google_guava_failureaccess_1_0_1.xml
│  │  ├─ Maven__com_google_guava_guava_31_0_1_jre.xml
│  │  ├─ Maven__com_google_guava_listenablefuture_9999_0_empty_to_avoid_conflict_with_guava.xml
│  │  ├─ Maven__com_google_j2objc_j2objc_annotations_1_3.xml
│  │  ├─ Maven__com_sun_activation_jakarta_activation_1_2_2.xml
│  │  ├─ Maven__com_typesafe_netty_netty_reactive_streams_2_0_4.xml
│  │  ├─ Maven__io_netty_netty_buffer_4_1_68_Final.xml
│  │  ├─ Maven__io_netty_netty_codec_4_1_67_Final.xml
│  │  ├─ Maven__io_netty_netty_codec_http_4_1_67_Final.xml
│  │  ├─ Maven__io_netty_netty_codec_socks_4_1_60_Final.xml
│  │  ├─ Maven__io_netty_netty_common_4_1_68_Final.xml
│  │  ├─ Maven__io_netty_netty_handler_4_1_67_Final.xml
│  │  ├─ Maven__io_netty_netty_handler_proxy_4_1_60_Final.xml
│  │  ├─ Maven__io_netty_netty_resolver_4_1_68_Final.xml
│  │  ├─ Maven__io_netty_netty_transport_4_1_68_Final.xml
│  │  ├─ Maven__io_netty_netty_transport_native_epoll_4_1_67_Final.xml
│  │  ├─ Maven__io_netty_netty_transport_native_epoll_linux_x86_64_4_1_60_Final.xml
│  │  ├─ Maven__io_netty_netty_transport_native_kqueue_4_1_67_Final.xml
│  │  ├─ Maven__io_netty_netty_transport_native_kqueue_osx_x86_64_4_1_60_Final.xml
│  │  ├─ Maven__io_netty_netty_transport_native_unix_common_4_1_67_Final.xml
│  │  ├─ Maven__io_opentelemetry_opentelemetry_api_1_6_0.xml
│  │  ├─ Maven__io_opentelemetry_opentelemetry_api_metrics_1_6_0_alpha.xml
│  │  ├─ Maven__io_opentelemetry_opentelemetry_context_1_6_0.xml
│  │  ├─ Maven__io_opentelemetry_opentelemetry_exporter_logging_1_6_0.xml
│  │  ├─ Maven__io_opentelemetry_opentelemetry_sdk_1_6_0.xml
│  │  ├─ Maven__io_opentelemetry_opentelemetry_sdk_common_1_6_0.xml
│  │  ├─ Maven__io_opentelemetry_opentelemetry_sdk_extension_autoconfigure_1_6_0_alpha.xml
│  │  ├─ Maven__io_opentelemetry_opentelemetry_sdk_extension_autoconfigure_spi_1_6_0.xml
│  │  ├─ Maven__io_opentelemetry_opentelemetry_sdk_metrics_1_6_0_alpha.xml
│  │  ├─ Maven__io_opentelemetry_opentelemetry_sdk_trace_1_6_0.xml
│  │  ├─ Maven__io_opentelemetry_opentelemetry_semconv_1_6_0_alpha.xml
│  │  ├─ Maven__io_ous_jtoml_2_0_0.xml
│  │  ├─ Maven__junit_junit_4_11.xml
│  │  ├─ Maven__net_bytebuddy_byte_buddy_1_11_19.xml
│  │  ├─ Maven__org_apache_commons_commons_exec_1_3.xml
│  │  ├─ Maven__org_asynchttpclient_async_http_client_2_12_3.xml
│  │  ├─ Maven__org_asynchttpclient_async_http_client_netty_utils_2_12_3.xml
│  │  ├─ Maven__org_checkerframework_checker_qual_3_12_0.xml
│  │  ├─ Maven__org_hamcrest_hamcrest_core_1_3.xml
│  │  ├─ Maven__org_reactivestreams_reactive_streams_1_0_3.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_api_4_0_0.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_chrome_driver_4_0_0.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_chromium_driver_4_0_0.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_devtools_v85_4_0_0.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_devtools_v93_4_0_0.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_devtools_v94_4_0_0.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_devtools_v95_4_0_0.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_edge_driver_4_0_0.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_firefox_driver_4_0_0.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_firefox_xpi_driver_4_0_0.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_http_4_0_0.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_ie_driver_4_0_0.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_java_4_0_0.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_json_4_0_0.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_opera_driver_4_0_0.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_remote_driver_4_0_0.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_safari_driver_4_0_0.xml
│  │  ├─ Maven__org_seleniumhq_selenium_selenium_support_4_0_0.xml
│  │  └─ Maven__org_slf4j_slf4j_api_1_7_30.xml
│  ├─ misc.xml
│  ├─ modules.xml
│  ├─ runConfigurations.xml
│  ├─ uiDesigner.xml
│  ├─ vcs.xml
│  └─ workspace.xml
├─ .project
├─ .settings
│  ├─ org.eclipse.core.resources.prefs
│  ├─ org.eclipse.jdt.apt.core.prefs
│  ├─ org.eclipse.jdt.core.prefs
│  └─ org.eclipse.m2e.core.prefs
├─ demo.iml
├─ LICENSE
├─ pom.xml
├─ README.md
├─ src
│  ├─ drive
│  │  ├─ chromedriver.exe
│  │  └─ msedgedriver.exe
│  └─ test
│     └─ java
│        └─ br
│           └─ inatel
│              └─ test
│                 ├─ ChromeTest.java
│                 └─ EdgeTest.java
└─ target
   └─ test-classes
      └─ br
         └─ inatel
            └─ test

```



## 🛠 Tecnologias

### Ferramentas e Serviços
- [Git](https://git-scm.com/)
- [Selenium Web Driver](https://www.selenium.dev/documentation/webdriver/)



### Dependências 


### Dependências de desenvolvimento
-[Maven](https://maven.apache.org)
