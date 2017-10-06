//
//  GADMUAdapterNendMediationExtras.h
//
// Copyright © 2017年 F@N Communications, Inc. All rights reserved.
//

#import <Foundation/Foundation.h>

#import <GoogleMobileAds/GoogleMobileAds.h>

@interface GADMUAdapterNendMediationExtras : NSObject
- (id<GADAdNetworkExtras>)adNetworkExtrasWithDictionary:(NSDictionary<NSString *, NSString *> *)extras;
@end
