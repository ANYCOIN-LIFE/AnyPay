/**
 * AnyCoin 전송 요청 method
 * param:
 * userID / 보내는 지갑주소 / 받는 지갑주소 / 전송하는 CoinAddress / value / transfer
/ -1 / app kind

*****************************************************************************/
public class AnyCoinTrans {

    String str_urlPath = userData1()
            + Constant.SLASH + userData2()
            + Constant.SLASH + userData3()
            + Constant.SLASH + userData4()
            + Constant.SLASH + userData5()
            + Constant.SLASH + userData6()
            + Constant.SLASH + userData7()
            + Constant.SLASH + userData8();

// AnyCoin Get 방식의 통신을 사용하기 위한 GetAsyncTask execute
 GetAsyncTask task = new GetAsyncTask(context,
Constant.SERVICE_TRANSFERCOINLIST, Constant.REQ_PATH_HEADER +
Constant.REQ_PATH_INSERTTRANSACTION + str_urlPath, new
IJsonArrayReturnCallback() {
    @Override
    public void postExecute(JSONArray object) {
        try {
            if(object != null) {
                // Result OK
if(object.getJSONObject(0).getString(Constant.RS_RETURN_CODE).equals(Constant.
RS_RETURN_00)) {
                    AlertDialogUtil.showDialog(context,
getString(R.string.msg_success_trans), new OnSingleClickListener() {
                        @Override
                        public void onSingleClick(View v) {
                            AlertDialogUtil.dismissDialog();
                            Intent intent = new Intent();
                            setResult(Activity.RESULT_OK, intent);
                            finish();
                        }
                    });
                } // Result Error
                else
if(object.getJSONObject(0).getString(Constant.RS_RETURN_CODE).equals(Constant.
RS_ESQL001)) {
                    AlertDialogUtil.showDialog(context,
getString(R.string.error_esql001_trans), new OnSingleClickListener() {
                        @Override
                        public void onSingleClick(View v) {
                            AlertDialogUtil.dismissDialog();
                            finish();
                        }
                    });
                } // omit other Error Code…
		else {
                    AlertDialogUtil.showDialog(context,
getString(R.string.error_e00), new OnSingleClickListener() {
                        @Override
                        public void onSingleClick(View v) {
                            AlertDialogUtil.dismissDialog();
                            finish();
                        }
                    });
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            AlertDialogUtil.showDialog(context,
getString(R.string.error_try_catch), new OnSingleClickListener() {
                @Override
                public void onSingleClick(View v) {
                    AlertDialogUtil.dismissDialog();
                    finish();
                }
            });
        }
    }
});
 task.execute();
}


/**
 * AnyCoin 지불 요청 method
 * param:
 * userID / 보내는 지갑주소 / 상점 지갑주소 / 전송하는 CoinAddress / value / payment
/ 상점 ID / app kind

*****************************************************************************/
public class AnyCoinPayment {

    String str_urlPath = userData1()
            + Constant.SLASH + userData2()
            + Constant.SLASH + userData3()}
            + Constant.SLASH + userData4()
            + Constant.SLASH + userData5()
            + Constant.SLASH + userData6()
            + Constant.SLASH + userData7()
            + Constant.SLASH + userData8();

    // AnyCoin Get 방식의 통신을 사용하기 위한 GetAsyncTask execute
    GetAsyncTask task = new GetAsyncTask(context, Constant.SERVICE_WALLET_PAY,
Constant.REQ_PATH_HEADER + Constant.REQ_PATH_INSERTTRANSACTION + str_urlPath,
new IJsonArrayReturnCallback() {
        @Override
        public void postExecute(JSONArray object) {
            try {
                if(object != null) {
                    // Result OK

if(object.getJSONObject(0).getString(Constant.RS_RETURN_CODE).equals(Constant.
RS_RETURN_00)) {
                        AlertDialogUtil.showDialog(context,
getString(R.string.msg_payment_succes), new OnSingleClickListener() {
                            @Override
                            public void onSingleClick(View v) {
                                AlertDialogUtil.dismissDialog();
                                Intent intent = new Intent();
                                setResult(Activity.RESULT_OK, intent);
                                finish();
                            }
                        });
                    } // Result Error
                    else
if(object.getJSONObject(0).getString(Constant.RS_RETURN_CODE).equals(Constant.
RS_ESQL001)) {
                        AlertDialogUtil.showDialog(context,
getString(R.string.error_esql001_pay), new OnSingleClickListener() {
                            @Override
                            public void onSingleClick(View v) {
                                AlertDialogUtil.dismissDialog();
                                finish();
                            }
                        });
                    } // omit other Error Code…
                    else {
                        AlertDialogUtil.showDialog(context,
getString(R.string.error_e00), new OnSingleClickListener() {
                            @Override
                            public void onSingleClick(View v) {
                                AlertDialogUtil.dismissDialog();
                                finish();
                            }
                        });
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
                AlertDialogUtil.showDialog(context,
getString(R.string.error_try_catch), new OnSingleClickListener() {
                    @Override
                    public void onSingleClick(View v) {
                        AlertDialogUtil.dismissDialog();
                        finish();
                    }
                });
            }
        }
    });
    task.execute();
}


/**
 * AnyCoin Swap method
 * param:
 * UserID / 보내는 지갑주소 / 상점 지갑주소 / 전송하는 CoinAddress / value / payment
/ 상점 ID / app kind

*****************************************************************************/
public class AnyCoinSwap {

    String str_urlPath = userData1()
            + Constant.SLASH + userData2()
            + Constant.SLASH + userData3()
            + Constant.SLASH + userData4()
            + Constant.SLASH + userData5()
            + Constant.SLASH + userData6()
            + Constant.SLASH + userData7();

    GetAsyncTask task = new GetAsyncTask(context, Constant.SERVICE_ETH_TRANS,
Constant.REQ_PATH_HEADER + Constant.REQ_PATH_INSERTSWAPPINFUNDING +
str_urlPath, new IJsonArrayReturnCallback() {
        @Override
        public void postExecute(JSONArray object) {
            try {
                if(object != null) {
                    // Result OK

if(object.getJSONObject(0).getString(Constant.RS_RETURN_CODE).equals(Constant.
RS_RETURN_00)) {
                        AlertDialogUtil.showDialog(context,
getString(R.string.msg_success_trans), new OnSingleClickListener() {
                            @Override
                            public void onSingleClick(View v) {
                                AlertDialogUtil.dismissDialog();
                                Intent intent = new Intent();
                                setResult(Activity.RESULT_OK, intent);
                                finish();
                            }
                        });
                    } // Result Error
                    else
if(object.getJSONObject(0).getString(Constant.RS_RETURN_CODE).equals(Constant.
RS_ESQL001)) {
                        AlertDialogUtil.showDialog(context,
getString(R.string.error_esql001_trans), new OnSingleClickListener() {
                            @Override
                            public void onSingleClick(View v) {
                                AlertDialogUtil.dismissDialog();
                                finish();
                            }
                        });
                    } // omit other Error Code…
                    else {
                        AlertDialogUtil.showDialog(context,
getString(R.string.error_e00), new OnSingleClickListener() {
                            @Override
                            public void onSingleClick(View v) {
                                AlertDialogUtil.dismissDialog();
                                finish();
                            }
                        });
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
                AlertDialogUtil.showDialogDouble(context,
getString(R.string.error_try_catch_retry), new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialogUtil.dismissDialog();
                        recreate();
                    }
                }, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialogUtil.dismissDialog();
                        finish();
                    }
                });
            }
        }
    });
    task.execute();
}


/**
 * AnyCoin Get 방식의 통신을 사용하기 위한 Task
 */
public class AnyCoinAsyncTask extends AsyncTask<Void, Void, JSONArray> {

   /**
    * Adapter Global variable

***************************************************************************/
   private String serviceName;
   private String requestApi;
   private IJsonArrayReturnCallback callback;
   private LoadingProgressDialog progress;
   private AnyCoinHttpUtil AnyCoinHttpUtil;

    /**
     * 생성자

**************************************************************************/
   public AnyCoinAsyncTask(Context context, String serviceName, String
requestApi, IJsonArrayReturnCallback callback) {
      this.serviceName = serviceName;
      this.requestApi = requestApi;
      this.callback = callback;

      progress = new LoadingProgressDialog(context);
      AnyCoinHttpUtil = new AnyCoinHttpUtil();
   }

   @Override
   protected void onPreExecute() {
      super.onPreExecute();
      showProgress();

      LogUtil.i("serviceName : [" + serviceName + "]");
      LogUtil.i("requestApi : [" + requestApi + "]");
   }

   @Override
   protected JSONArray doInBackground(Void... params) {
      return AnyCoinHttpUtil.requestGet(requestApi);
   }

   @Override
   protected void onPostExecute(JSONArray result) {
      dismissProgress();
      if(callback != null) {
         callback.postExecute(result);
      }
      super.onPostExecute(result);
   }

   /**
    * 프로그레스바 시작
    **************************************************************************/
   private void showProgress() {
      progress.show();
   }

   /**
    * 프로그레스바 종료

***************************************************************************/
   private void dismissProgress() {
      progress.dismiss();
   }
}

/**
 * AnyCoin HttpUtil & Http Get
 */
public class AnyCoinHttpUtil {

    /**
     * 서버 response 값을 저장할 buffer

*****************************************************************************/
    private StringBuffer buffer = new StringBuffer();

   /**
    * 응답 및 연결시간
    ***********************************************************************/
   private final int READ_TIME_OUT = 13000;
   private final int CONNECTION_TIME_OUT = 13000;

    /**
     * Url & HttpURLConnection

*****************************************************************************/
   private URL url;

    /**
     * http header 및 request 형식 관련 상수 값

*****************************************************************************/
   private static final String CONTENT_HTTP_GET_CONNECTION_TIMEOUT =
"http.connection.timeout";
   private static final String CONTENT_HTTP_GET_SOCKET_TIMEOUT =
"http.socket.timeout";

    /**
     * GET 형식으로 서버에 request를 날린다.
     */
    public JSONArray requestGet(String urlString) {
        LogUtil.d("requestPost() url : " + urlString);

        BufferedWriter writer = null;
        try {
            url = new URL(urlString);

         HttpClient httpClient = new DefaultHttpClient();

httpClient.getParams().setParameter(CONTENT_HTTP_GET_CONNECTION_TIMEOUT,
CONNECTION_TIME_OUT);
            httpClient.getParams().setParameter(CONTENT_HTTP_GET_SOCKET_TIMEOUT,
READ_TIME_OUT);

            HttpGet get = new HttpGet(urlString);
            HttpResponse response = httpClient.execute(get);
            HttpEntity resEntity = response.getEntity();

            int responseCode = response.getStatusLine().getStatusCode();
            LogUtil.d("responseCode : [" + responseCode + "]");

            if (responseCode == HttpsURLConnection.HTTP_OK) {
                String line;
                BufferedReader br = new BufferedReader(new
InputStreamReader(resEntity.getContent()));
                while ((line = br.readLine()) != null) {
                    buffer.append(line);
                }
            } else {
                LogUtil.d(EntityUtils.toString(resEntity));
            }
        } catch (Exception e) {
            LogUtil.e("requestPost() exception - " + e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        LogUtil.i("response : [" + buffer.toString() + "]");

        try {
            if(CommonUtil.isStringNull(buffer.toString())) {
                String error = "[{\"return code\": \"HTTP ERROR\"}]";
                return new JSONArray(error);
            } else {
                return new JSONArray(buffer.toString());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }
}
