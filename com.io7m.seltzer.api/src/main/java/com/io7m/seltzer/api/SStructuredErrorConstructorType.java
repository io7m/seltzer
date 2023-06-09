/*
 * Copyright © 2023 Mark Raynsford <code@io7m.com> https://www.io7m.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */


package com.io7m.seltzer.api;

import org.osgi.annotation.versioning.ProviderType;

import java.util.Map;
import java.util.Optional;

/**
 * The type of constructor functions for structured errors.
 *
 * @param <C> The type of error codes
 * @param <T> The type of constructed values
 */

@ProviderType
@FunctionalInterface
public interface SStructuredErrorConstructorType<C, T>
{
  /**
   * Construct a value.
   *
   * @param errorCode         The error code
   * @param message           The message
   * @param attributes        The attributes
   * @param remediatingAction The remediating action
   * @param exception         The exception
   *
   * @return A structured error value
   */

  T construct(
    C errorCode,
    String message,
    Map<String, String> attributes,
    Optional<String> remediatingAction,
    Optional<Throwable> exception
  );
}
