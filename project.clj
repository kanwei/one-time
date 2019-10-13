(defproject kanwei/one-time "0.7.0"
  :author "Suvash Thapaliya"
  :description "One Time Password (TOTP and HOTP) library for Clojure. TOTP/HOTP is widely used for Two factor / Multi Factor Authentication."
  :url "http://github.com/suvash/one-time"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :deploy-repositories [["releases" {:sign-releases false :url "https://clojars.org"}]
                        ["snapshots" {:sign-releases false :url "https://clojars.org"}]]

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [commons-codec "1.11"]
                 [ring/ring-codec "1.1.1"]
                 [io.nayuki/qrcodegen "1.5.0"]]
  :profiles {:dev    {:plugins [[lein-cloverage "1.0.13"]
                                [lein-codox "0.10.6"]]}
             :1.6    {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.7    {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.8    {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :1.9    {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :1.10   {:dependencies [[org.clojure/clojure "1.10.0"]]}
             :master {:dependencies [[org.clojure/clojure "1.11.0-master-SNAPSHOT"]]}}
  :codox {:output-path "docs"
          :doc-files   ["README.md"]
          :source-uri  "https://github.com/suvash/one-time/blob/v{version}/{filepath}#L{line}"}
  #_#_:repositories {"jitpack"            "https://jitpack.io"
                     "sonatype"           {:url       "https://oss.sonatype.org/content/repositories/releases"
                                           :snapshots false
                                           :releases  {:checksum :fail :update :always}}
                     "sonatype-snapshots" {:url       "https://oss.sonatype.org/content/repositories/snapshots"
                                           :snapshots true
                                           :releases  {:checksum :fail :update :always}}}
  :aliases {"all" ["with-profile" "+dev:+1.6:+1.7:+1.8:+1.9:+1.10:+master"]}
  :global-vars {*warn-on-reflection* true})
