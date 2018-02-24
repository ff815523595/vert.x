/*
 * Copyright (c) 2011-2017 Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 */

/**
 * === Error handling
 *
 * As you saw in previous sections the DnsClient allows you to pass in a Handler which will be notified with an
 * AsyncResult once the query was complete. In case of an error it will be notified with a DnsException which will
 * hole a {@link io.vertx.core.dns.DnsResponseCode} that indicate why the resolution failed. This DnsResponseCode
 * can be used to inspect the cause in more detail.
 *
 * Possible DnsResponseCodes are:
 *
 * - {@link io.vertx.core.dns.DnsResponseCode#NOERROR} No record was found for a given query
 * - {@link io.vertx.core.dns.DnsResponseCode#FORMERROR} Format error
 * - {@link io.vertx.core.dns.DnsResponseCode#SERVFAIL} Server failure
 * - {@link io.vertx.core.dns.DnsResponseCode#NXDOMAIN} Name error
 * - {@link io.vertx.core.dns.DnsResponseCode#NOTIMPL} Not implemented by DNS Server
 * - {@link io.vertx.core.dns.DnsResponseCode#REFUSED} DNS Server refused the query
 * - {@link io.vertx.core.dns.DnsResponseCode#YXDOMAIN} Domain name should not exist
 * - {@link io.vertx.core.dns.DnsResponseCode#YXRRSET} Resource record should not exist
 * - {@link io.vertx.core.dns.DnsResponseCode#NXRRSET} RRSET does not exist
 * - {@link io.vertx.core.dns.DnsResponseCode#NOTZONE} Name not in zone
 * - {@link io.vertx.core.dns.DnsResponseCode#BADVERS} Bad extension mechanism for version
 * - {@link io.vertx.core.dns.DnsResponseCode#BADSIG} Bad signature
 * - {@link io.vertx.core.dns.DnsResponseCode#BADKEY} Bad key
 * - {@link io.vertx.core.dns.DnsResponseCode#BADTIME} Bad timestamp
 *
 * All of those errors are "generated" by the DNS Server itself.
 *
 * You can obtain the DnsResponseCode from the DnsException like:
 *
 * [source,java]
 * ----
 * {@link docoverride.dns.Examples#example16}
 * ----
 */
package docoverride.dns;
